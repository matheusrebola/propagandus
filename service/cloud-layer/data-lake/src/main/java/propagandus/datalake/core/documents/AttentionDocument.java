package propagandus.datalake.core.documents;

import java.time.LocalDateTime;

import propagandus.datalake.core.models.enumerators.EAttentionLevel;
import propagandus.datalake.core.models.enumerators.ESEx;

public record AttentionDocument(
	Long attentionId,
	EAttentionLevel attentionLevel,
	Byte attentionValue,
	Short lookCount,
	Short peopleCount,
	ESEx sex,
	LocalDateTime attentionTime,
	Long locationId,
	Long advertisingId,
	Long painelId) {

}
