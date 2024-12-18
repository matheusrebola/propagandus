package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EAttentionLevel;
import propagandus.datalake.core.models.enumerators.ESEx;

public record AttentionDto(
  Long attentionId,
  EAttentionLevel attentionLevel,
  Byte attentionValue,
  Short lookCount,
  Short peopleCount,
  ESEx sex,
  Long attentionTime,
  Long locationId,
  Long advertisingId,
  Long painelId
) {

}
