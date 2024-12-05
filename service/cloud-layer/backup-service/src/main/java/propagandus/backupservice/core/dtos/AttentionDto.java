package propagandus.backupservice.core.dtos;

import propagandus.backupservice.core.models.enumerators.EAttentionLevel;

public record AttentionDto(
  Long attentionId,
  Long painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
