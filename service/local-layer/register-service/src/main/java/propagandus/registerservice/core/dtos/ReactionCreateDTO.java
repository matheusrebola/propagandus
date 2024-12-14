package propagandus.registerservice.core.dtos;

import java.util.UUID;

import propagandus.registerservice.core.enumerators.EReactionType;

public record ReactionCreateDTO(
  UUID reactionId,
  UUID advertisingId,
  UUID locationId,
  EReactionType reactionType
) {

}
