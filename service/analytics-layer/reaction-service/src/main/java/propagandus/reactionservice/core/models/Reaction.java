package propagandus.reactionservice.core.models;

import propagandus.reactionservice.core.models.enumerators.EReactionType;

public record Reaction(
  Long id,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
  ) {
}
