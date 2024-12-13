package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record ReactionsByPeriodOfTheDay(
  @Id Long id,
  String periodOfTheDay,
  Long reactionCount
) {

}
