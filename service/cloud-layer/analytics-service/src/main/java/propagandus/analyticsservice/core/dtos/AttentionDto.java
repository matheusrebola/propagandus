package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EAttentionLevel;

public record AttentionDto(
  Long attentionId,
  Long painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
