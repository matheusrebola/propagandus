package propagandus.datapersistenceservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  EReactionType reactionType,
  Byte reactionScale,
  LocalDateTime reactionTime,
  Integer advertisingId,
  Integer locationId,
  Integer painelId
) {

}
