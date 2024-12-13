package propagandus.reactionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.reactionservice.core.models.enumerators.EReactionType;

@Document
public record ReactionsByLocationAndPeriod(
  @Id Long id,
  Long reactionId,
  Long advertisingId,
  Long locationId,
  EReactionType reactionType
) {

}
