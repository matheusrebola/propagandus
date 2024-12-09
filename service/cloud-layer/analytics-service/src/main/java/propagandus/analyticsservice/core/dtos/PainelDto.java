package propagandus.analyticsservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.analyticsservice.core.models.enumerators.EStatus;

public record PainelDto(
  @NotNull Long painelId,
  @NotNull String identification,
  @NotNull EStatus status,
  @NotNull String model,
  @NotNull Long locationId,
  @NotNull Long advertisingId,
  @NotNull Long attentionId,
  @NotNull Long reactionId,
  @NotNull Long packageTypeId
) {

}
