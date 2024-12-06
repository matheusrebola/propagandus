package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
