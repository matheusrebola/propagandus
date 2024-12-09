package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  @NotNull Long reactionId,
  @NotNull EReactionType reactionType,
  @NotNull Long reactionTimeId,
  @NotNull Long advertisingId,
  @NotNull Long locationId,
  @NotNull Long painelId
) {

}
