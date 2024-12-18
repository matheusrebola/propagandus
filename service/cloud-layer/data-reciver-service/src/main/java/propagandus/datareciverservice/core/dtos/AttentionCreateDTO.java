package propagandus.datareciverservice.core.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import propagandus.datareciverservice.core.enumerators.EAttentionLevel;
import propagandus.datareciverservice.core.enumerators.ESex;

public record AttentionCreateDTO(
  EAttentionLevel attentionLevel,
  Byte attentionValue,
  Short lookCount,
  Short peopleCount,
  ESex sex,
  LocalDateTime periodRegister,
  UUID advertisingId,
  Integer painelId
) {

}
