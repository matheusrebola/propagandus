package propagandus.datalake.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datalake.core.models.enumerators.EReactionType;

public record ReactionDto(
  @NotNull Long reactionId,
  @NotNull EReactionType reactionType,
  @NotNull Long reactionTimeId,
  @NotNull Long advertisingId,
  @NotNull Long locationId,
  @NotNull Long painelId
) {

}
