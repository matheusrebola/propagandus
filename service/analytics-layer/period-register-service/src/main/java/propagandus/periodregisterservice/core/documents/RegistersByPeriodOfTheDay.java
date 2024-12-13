package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record RegistersByPeriodOfTheDay(
  @Id Long id,
  String periodOfTheDay,
  Long registerCount
) {

}
