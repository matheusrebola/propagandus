package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EStatus;

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
