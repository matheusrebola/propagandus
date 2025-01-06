package propagandus.datapersistenceservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

public record ReactionDto(
  Integer reactionId,
  EReactionType reactionType,
  Byte reactionScale,
  LocalDateTime reactionTime,
  Integer advertisingId,
  Integer locationId,
  Integer painelId
) {

}
