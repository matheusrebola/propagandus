package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

@Document
public record ReactionsByLocation(
		@Id Long id,
		Long locationId,
		String streetName,
		String city,
		EReactionType reactionType,
		Long totalReactions
		) {

}
