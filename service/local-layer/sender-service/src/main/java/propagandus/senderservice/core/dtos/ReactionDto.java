package propagandus.senderservice.core.dtos;

import propagandus.senderservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Integer reactionId,
  EReactionType reactionType,
  Byte reactionScale,
  Integer reactionTime,
  Integer advertisingId,
  Integer locationId,
  Integer painelId
) {

}
