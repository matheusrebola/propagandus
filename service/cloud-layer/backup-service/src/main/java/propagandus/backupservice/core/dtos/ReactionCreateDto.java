package propagandus.backupservice.core.dtos;

import propagandus.backupservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
