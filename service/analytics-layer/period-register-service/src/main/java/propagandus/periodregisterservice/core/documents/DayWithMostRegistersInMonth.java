package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record DayWithMostRegistersInMonth(
  @Id Long id,
  Byte day,
  Long registerCount
) {

}
