package propagandus.datalake.core.services.attention;

import org.springframework.stereotype.Component;

import propagandus.datalake.core.documents.AttentionDocument;
import propagandus.datalake.core.dtos.AttentionCreateDto;

@Component
public class AttentionDtoFactory {
	public AttentionCreateDto createFrom(AttentionDocument attentionDocument, Long periodId) {
        return new AttentionCreateDto(
            attentionDocument.attentionLevel(),
            attentionDocument.attentionValue(),
            attentionDocument.lookCount(),
            attentionDocument.lookCount(),
            attentionDocument.sex(),
            periodId,
            attentionDocument.locationId(),
            attentionDocument.advertisingId(),
            attentionDocument.painelId()
        );
    }
}
