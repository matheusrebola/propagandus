package propagandus.registerservice.core.dtos;

import java.util.UUID;

import propagandus.registerservice.core.enumerators.EReactionType;

public record ReactionCreateDTO(
  UUID advertisingId,
  UUID locationId,
  Integer dateTimeId,
  UUID painelId,
  EReactionType reactionType
) {

}
