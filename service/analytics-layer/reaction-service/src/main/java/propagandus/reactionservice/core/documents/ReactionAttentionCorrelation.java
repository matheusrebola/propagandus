package propagandus.reactionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.reactionservice.core.models.enumerators.EAttentionLevel;
import propagandus.reactionservice.core.models.enumerators.EReactionType;

@Document
public record ReactionAttentionCorrelation(
  @Id Long id,
  EReactionType reactionType,
  Short reactionScale,
  EAttentionLevel attentionLevel,
  Byte avgAttentionValue,
  Integer totalLooks,
  Integer totalPeople
) {

}
