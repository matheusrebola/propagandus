package propagandus.reactionservice.core.dtos;

import propagandus.reactionservice.core.models.enumerators.EReactionType;

public record ReactionCountByTypeAndCityDTO(
  EReactionType reactionType,
  String city,
  Long reactionCount
) {

}
