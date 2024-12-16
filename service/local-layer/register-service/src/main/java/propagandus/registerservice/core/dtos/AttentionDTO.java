package propagandus.registerservice.core.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import propagandus.registerservice.core.enumerators.EAttentionLevel;
import propagandus.registerservice.core.enumerators.ESex;

public record AttentionDTO(
  Integer id,
  UUID painelId,
  LocalDateTime periodRegister,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount,
  ESex sex
) {

}
