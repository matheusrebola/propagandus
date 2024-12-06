package propagandus.periodregisterservice.core.models;

import java.time.LocalDateTime;

import propagandus.periodregisterservice.core.models.enumerators.EDayWeek;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;
import propagandus.periodregisterservice.core.models.enumerators.EPeriodOfTheDay;

public record PeriodRegister(
  Long id,
  Byte day,
  EDayWeek dayWeek,
  Byte hour,
  Byte minute,
  EPeriodOfTheDay periodOfTheDay,
  EMonth month,
  String year,
  LocalDateTime registerTime
  ) {
}
