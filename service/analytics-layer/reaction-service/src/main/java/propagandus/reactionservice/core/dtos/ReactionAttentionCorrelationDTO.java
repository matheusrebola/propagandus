package propagandus.reactionservice.core.dtos;

import propagandus.reactionservice.core.models.enumerators.EAttentionLevel;
import propagandus.reactionservice.core.models.enumerators.EReactionType;

public record ReactionAttentionCorrelationDTO(
  EReactionType reactionType,
  Short reactionScale,
  EAttentionLevel attentionLevel,
  Byte avgAttentionValue,
  Integer totalLooks,
  Integer totalPeople
) {

}
