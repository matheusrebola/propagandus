package propagandus.datalake.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datalake.core.models.enumerators.EAttentionLevel;

public record AttentionCreateDto(
  @NotNull EAttentionLevel attention,
  @NotNull Byte attentionLevel,
  @NotNull Short lookCount,
  @NotNull Short peopleCount,
  @NotNull Long attentionTime,
  @NotNull Long painelId
) {

}
