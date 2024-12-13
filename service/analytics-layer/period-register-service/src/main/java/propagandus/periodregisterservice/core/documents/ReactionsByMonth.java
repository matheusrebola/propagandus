package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public record ReactionsByMonth(
  @Id Long id,
  EMonth month,
  Long reactionCount
) {

}
