package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EDayWeek;
import propagandus.datalake.core.models.enumerators.EMonth;
import propagandus.datalake.core.models.enumerators.EPeriodOfTheDay;

public record PeriodRegisterCreateDto(
  Byte day,
  EDayWeek dayWeek,
  Byte hour,
  Byte minute,
  EPeriodOfTheDay periodOfTheDay,
  EMonth month,
  String year
) {

}
