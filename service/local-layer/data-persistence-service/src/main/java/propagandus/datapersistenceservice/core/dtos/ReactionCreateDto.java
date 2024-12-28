package propagandus.datapersistenceservice.core.dtos;

import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  EReactionType reactionType,
  Byte reactionScale,
  Integer reactionTime,
  Integer advertisingId,
  Integer locationId,
  Integer painelId
) {

}
