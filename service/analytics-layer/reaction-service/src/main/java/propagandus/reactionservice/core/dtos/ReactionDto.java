package propagandus.reactionservice.core.dtos;

import propagandus.reactionservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Long reactionId,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
