package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

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
