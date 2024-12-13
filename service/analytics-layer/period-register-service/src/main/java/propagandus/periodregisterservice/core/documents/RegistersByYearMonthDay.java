package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public record RegistersByYearMonthDay(
  @Id Long id,
  String year,
  EMonth month,
  Byte day,
  Long registerCount
) {

}
