package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EReactionType;

public record ReactionCreateDto(
  EReactionType reactionType,
  Byte reactionScale,
  Long advertisingId,
  Long reactionTimeId,
  Long locationId,
  Long painelId
) {

}
