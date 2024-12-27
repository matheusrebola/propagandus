package propagandus.viewservice.core.dtos;

import propagandus.viewservice.core.enumerators.EAttentionLevel;
import propagandus.viewservice.core.enumerators.EReactionType;

public record ReactionAttentionCorrelationDTO(
  EReactionType reactionType,
  Short reactionScale,
  EAttentionLevel attentionLevel,
  Byte avgAttentionValue,
  Integer totalLooks,
  Integer totalPeople
) {

}
