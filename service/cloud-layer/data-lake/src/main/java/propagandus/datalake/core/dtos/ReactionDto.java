package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EReactionType;

public record ReactionDto(
  Long reactionId,
  EReactionType reactionType,
  Byte reactionScale,
  Long advertisingId,
  Long reactionTimeId,
  Long locationId,
  Long painelId
) {

}
