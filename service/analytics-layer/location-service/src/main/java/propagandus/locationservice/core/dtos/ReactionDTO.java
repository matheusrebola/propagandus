package propagandus.locationservice.core.dtos;

import propagandus.locationservice.core.models.enumerators.EReactionType;

public record ReactionDTO(
  Long reactionId,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
