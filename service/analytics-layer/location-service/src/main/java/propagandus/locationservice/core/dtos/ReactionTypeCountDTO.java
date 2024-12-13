package propagandus.locationservice.core.dtos;

import propagandus.locationservice.core.models.enumerators.EReactionType;

public record ReactionTypeCountDTO(
  EReactionType reactionType,
  Long count
) {

}
