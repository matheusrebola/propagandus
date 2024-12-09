package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Long reactionId,
  EReactionType reactionType,
  Long reactionTimeId,
  Long advertisingId,
  Long locationId,
  Long painelId
) {

}
