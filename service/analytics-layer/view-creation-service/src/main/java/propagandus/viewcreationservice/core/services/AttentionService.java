package propagandus.viewcreationservice.core.services;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.springframework.retry.annotation.Retryable;
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

    @Retryable
    private void attentionByAudience() {
        List<AttentionByAudience> attention = findAttentionByAudience();
        if (!attention.isEmpty()) {
            saveAttentionByAudience(attention);
        } else {
            log.warn("Nenhum dado para salvar no MongoDB.");
        }
    }

    public void saveAttentionByAudience(List<AttentionByAudience> attentions) {
        try {
            attentionByAudienceRepository.saveAll(attentions);
        } catch (DuplicateKeyException e) {
            log.warn("Chave duplicada ao salvar no MongoDB: {}", e.getMessage());
        } catch (MongoWriteException e) {
            log.error("Erro ao escrever no MongoDB: {}", e.getMessage());
            throw e;
        }
    }

    public List<AttentionByAudience> findAttentionByAudience() {
        try {
            List<AttentionByAudienceDTO> dtoList = attentionRepository.attentionByAudience();
            if (dtoList == null || dtoList.isEmpty()) {
                throw new InvalidDataException("Nenhum dado encontrado no banco relacional");
            }
            return dtoList.stream()
                .map(attentionByAudienceMapper::map)
                .toList();
        } catch (InvalidDataException e) {
            log.warn("Dados inválidos: {}", e.getMessage());
            throw e;
        }
    }
}