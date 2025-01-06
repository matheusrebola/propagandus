package propagandus.datapersistenceservice.core.documents;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.datapersistenceservice.core.models.enumerators.EAttentionLevel;
import propagandus.datapersistenceservice.core.models.enumerators.ESEx;

@Document
public record Attention(
	@Id Integer attentionId,
	EAttentionLevel attentionLevel,
	Byte attentionValue,
	Short lookCount,
	Short peopleCount,
	ESEx sex,
	LocalDateTime attentionTime,
	Integer locationId,
	Integer advertisingId,
	Integer painelId
) {

}
