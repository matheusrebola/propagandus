package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.locationservice.core.models.enumerators.EReactionType;

@Document
public record ReactionsByTypeInCity(
  @Id Long id,
  EReactionType reactionType,
  Long count
) {

}
