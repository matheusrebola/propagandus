package propagandus.viewcreationservice.core.dtos;

import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

public record ReactionsByLocationDTO(
		Long locationId,
		String streetName,
		String city,
		EReactionType reactionType,
		Long totalReactions
		) {

}
