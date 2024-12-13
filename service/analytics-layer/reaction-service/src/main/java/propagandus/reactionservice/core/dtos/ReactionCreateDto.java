package propagandus.reactionservice.core.dtos;

import propagandus.reactionservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
