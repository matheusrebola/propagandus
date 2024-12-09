package propagandus.analyticsservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.analyticsservice.core.models.enumerators.EStatus;

public record PainelCreateDto(
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
