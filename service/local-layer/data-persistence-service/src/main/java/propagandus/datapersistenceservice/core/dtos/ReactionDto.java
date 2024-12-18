package propagandus.datapersistenceservice.core.dtos;

import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

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
