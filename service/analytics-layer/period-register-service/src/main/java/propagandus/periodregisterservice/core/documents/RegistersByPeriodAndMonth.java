package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public record RegistersByPeriodAndMonth(
  @Id Long id,
  String periodOfTheDay,
  EMonth month,
  Long registerCount
) {

}
