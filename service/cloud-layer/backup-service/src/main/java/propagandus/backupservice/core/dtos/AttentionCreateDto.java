package propagandus.backupservice.core.dtos;

import propagandus.backupservice.core.models.enumerators.EAttentionLevel;

public record AttentionCreateDto(
  Long painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
