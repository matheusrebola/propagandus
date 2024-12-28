package propagandus.senderservice.core.dtos;

import propagandus.senderservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  EReactionType reactionType,
  Byte reactionScale,
  Integer reactionTime,
  Integer advertisingId,
  Integer locationId,
  Integer painelId
) {

}
