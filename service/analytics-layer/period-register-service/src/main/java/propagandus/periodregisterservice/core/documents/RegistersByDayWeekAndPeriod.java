package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record RegistersByDayWeekAndPeriod(
  @Id Long id,
  String dayWeek,
  String periodOfTheDay,
  Long registerCount
) {

}
