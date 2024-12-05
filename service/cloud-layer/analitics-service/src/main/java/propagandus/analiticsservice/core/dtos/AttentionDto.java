package propagandus.analiticsservice.core.dtos;

import propagandus.analiticsservice.core.models.enumerators.EAttentionLevel;

public record AttentionDto(
  Long attentionId,
  Long painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
