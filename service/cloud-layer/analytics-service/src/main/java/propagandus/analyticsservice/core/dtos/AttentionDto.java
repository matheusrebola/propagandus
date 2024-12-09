package propagandus.analyticsservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.analyticsservice.core.models.enumerators.EAttentionLevel;

public record AttentionDto(
  @NotNull Long attentionId,
  @NotNull EAttentionLevel attention,
  @NotNull Byte attentionLevel,
  @NotNull Short lookCount,
  @NotNull Short peopleCount,
  @NotNull Long attentionTime,
  @NotNull Long painelId
) {

}
