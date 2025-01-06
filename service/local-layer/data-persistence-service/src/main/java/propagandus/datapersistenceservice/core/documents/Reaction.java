package propagandus.datapersistenceservice.core.documents;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

@Document
public record Reaction(
	@Id Integer reactionId,
	EReactionType reactionType,
	Byte reactionScale,
	LocalDateTime reactionTime,
	Integer advertisingId,
	Integer locationId,
	Integer painelId
) {

}
