package propagandus.viewcreationservice.core.dtos;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

public record ReactionAttentionCorrelationDTO(
  EReactionType reactionType,
  Short reactionScale,
  EAttentionLevel attentionLevel,
  Byte avgAttentionValue,
  Integer totalLooks,
  Integer totalPeople
) {

}
