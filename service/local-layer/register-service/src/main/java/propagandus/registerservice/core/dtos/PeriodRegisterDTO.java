package propagandus.registerservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.registerservice.core.enumerators.EDayWeek;
import propagandus.registerservice.core.enumerators.EMonth;
import propagandus.registerservice.core.enumerators.EPeriodOfTheDay;

public record PeriodRegisterDTO(
  Integer id,
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
