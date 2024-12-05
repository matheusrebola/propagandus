package propagandus.backupservice.core.dtos;

import java.time.LocalDateTime;

import propagandus.backupservice.core.models.enumerators.EDayWeek;
import propagandus.backupservice.core.models.enumerators.EMonth;
import propagandus.backupservice.core.models.enumerators.EPeriodOfTheDay;

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
