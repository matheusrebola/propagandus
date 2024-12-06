package propagandus.analyticsservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.analyticsservice.core.models.enumerators.EDayWeek;
import propagandus.analyticsservice.core.models.enumerators.EMonth;
import propagandus.analyticsservice.core.models.enumerators.EPeriodOfTheDay;

public record PeriodRegisterDto(
  Long periodRegisterId,
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
