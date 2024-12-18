package propagandus.senderservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.senderservice.core.models.enumerators.EAttentionLevel;
import propagandus.senderservice.core.models.enumerators.ESEx;

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
