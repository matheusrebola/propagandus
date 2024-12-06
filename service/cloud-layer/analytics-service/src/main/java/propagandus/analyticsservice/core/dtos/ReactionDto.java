package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Long reactionId,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
