package propagandus.analiticsservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.analiticsservice.core.models.enumerators.EDayWeek;
import propagandus.analiticsservice.core.models.enumerators.EMonth;
import propagandus.analiticsservice.core.models.enumerators.EPeriodOfTheDay;

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
