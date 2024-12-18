package propagandus.datapersistenceservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.datapersistenceservice.core.models.enumerators.EAttentionLevel;
import propagandus.datapersistenceservice.core.models.enumerators.ESEx;

public record AttentionCreateDto(
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
