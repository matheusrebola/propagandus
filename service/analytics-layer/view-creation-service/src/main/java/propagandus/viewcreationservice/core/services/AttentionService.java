package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoWriteException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import propagandus.viewcreationservice.core.documents.AttentionByAudience;
import propagandus.viewcreationservice.core.dtos.AttentionByAudienceDTO;
import propagandus.viewcreationservice.core.exceptions.InvalidDataException;
import propagandus.viewcreationservice.core.mappers.AttentionByAudienceMapper;
import propagandus.viewcreationservice.core.repositorys.AttentionRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.AttentionByAudienceRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class AttentionService extends AViewCreationService {
	private final AttentionRepository attentionRepository;
	private final AttentionByAudienceMapper attentionByAudienceMapper;
	private final AttentionByAudienceRepository attentionByAudienceRepository;

	@Override
	protected void executeProcess() {
		attentionByAudience();
	}

	private void attentionByAudience() {
		List<AttentionByAudience> attention = findAttentionByAudience();
		if (!attention.isEmpty()) {
			saveAttentionByAudience(attention);
		} else {throw new InvalidDataException("Lista de dados vazia");}
	}

	public void saveAttentionByAudience(List<AttentionByAudience> attentions) {
		try {
			attentionByAudienceRepository.saveAll(attentions);
		} catch (DuplicateKeyException e) {throw e;} catch (MongoWriteException e) {throw e;}
	}

	public List<AttentionByAudience> findAttentionByAudience() {
		try {
			List<AttentionByAudienceDTO> dtoList = attentionRepository.attentionByAudience();
			if (dtoList == null || dtoList.isEmpty()) {
				throw new InvalidDataException("Nenhum dado encontrado no banco relacional");
			}
			return dtoList.stream().map(attentionByAudienceMapper::map).toList();
		} catch (InvalidDataException e) {throw e;}
	}

	@Override
	public void clearDatabase() {
		try {
			attentionByAudienceRepository.deleteAll();
		} catch (MongoWriteException e) {throw e;}
	}

}