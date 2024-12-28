package propagandus.datareciverservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.datareciverservice.core.enumerators.EReactionType;

public record ReactionDTO(
  Integer id,
  EReactionType reactionType,
  Byte reactionScale,
  LocalDateTime dateTime,
  Integer advertisingId,
  Integer locationId,
  Integer painelId
) {

}
