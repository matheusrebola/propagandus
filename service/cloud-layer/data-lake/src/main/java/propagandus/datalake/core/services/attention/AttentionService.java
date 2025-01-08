package propagandus.datalake.core.services.attention;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.documents.AttentionDocument;
import propagandus.datalake.core.models.Attention;
import propagandus.datalake.core.dtos.AttentionCreateDto;
import propagandus.datalake.core.mappers.AttentionMapper;
import propagandus.datalake.core.models.PeriodRegister;
import propagandus.datalake.core.repositorys.AttentionRepository;
import propagandus.datalake.core.services.periodreaction.PeriodRegisterService;

@Service
@RequiredArgsConstructor
public class AttentionService {
	private PeriodRegisterService periodRegisterService;
    private AttentionMapper attentionMapper;
    private AttentionRepository attentionRepository;
    private AttentionDtoFactory attentionCreateDtoFactory;

    public Attention save(AttentionDocument attentionDocument) {
        PeriodRegister period = periodRegisterService.save(attentionDocument.attentionTime());
        Long periodId = period.id();

        AttentionCreateDto createDto = attentionCreateDtoFactory.createFrom(attentionDocument, periodId);
        Attention attentionMapped = attentionMapper.map(createDto);

        return attentionRepository.save(attentionMapped);
    }
}
