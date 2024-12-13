package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record RegistersByDayOfWeek(
  @Id Long id,
  String dayWeek,
  Long registerCount
) {

}
