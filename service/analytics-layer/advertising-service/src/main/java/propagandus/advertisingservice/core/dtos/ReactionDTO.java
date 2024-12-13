package propagandus.advertisingservice.core.dtos;

import propagandus.advertisingservice.core.models.enumerators.EReactionType;

public record ReactionDTO(
  Long reactionId,
  EReactionType reactionType,
  String locationCity,
  String locationState
) {

}
