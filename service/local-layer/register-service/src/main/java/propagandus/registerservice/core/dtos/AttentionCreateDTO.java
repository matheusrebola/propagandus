package propagandus.registerservice.core.dtos;

import java.util.UUID;

import propagandus.registerservice.core.enumerators.EAttentionLevel;
import propagandus.registerservice.core.enumerators.ESex;

public record AttentionCreateDTO(
  UUID painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount,
  ESex sex
) {

}
