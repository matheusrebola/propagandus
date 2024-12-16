package propagandus.registerservice.core.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import propagandus.registerservice.core.enumerators.EReactionType;

public record ReactionDTO(
  Integer id,
  UUID advertisingId,
  UUID locationId,
  LocalDateTime periodRegister,
  UUID painelId,
  EReactionType reactionType
) {

}
