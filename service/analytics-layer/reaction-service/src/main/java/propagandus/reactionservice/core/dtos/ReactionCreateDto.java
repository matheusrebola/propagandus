package propagandus.analiticsservice.core.dtos;

import propagandus.analiticsservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
