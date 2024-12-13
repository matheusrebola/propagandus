package propagandus.attentionservice.core.dtos;

import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;

public record AttentionDTO(
  Long attentionId,
  Long painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
