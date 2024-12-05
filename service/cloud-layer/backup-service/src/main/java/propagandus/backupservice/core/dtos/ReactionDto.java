package propagandus.backupservice.core.dtos;

import propagandus.backupservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Long reactionId,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
