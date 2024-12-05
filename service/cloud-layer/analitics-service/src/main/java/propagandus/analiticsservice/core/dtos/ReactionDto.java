package propagandus.analiticsservice.core.dtos;

import propagandus.analiticsservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Long reactionId,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
