package propagandus.registerservice.core.documents;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.registerservice.core.enumerators.EDayWeek;
import propagandus.registerservice.core.enumerators.EMonth;
import propagandus.registerservice.core.enumerators.EPeriodOfTheDay;

@Document
public record PeriodRegister(
  @Id Integer id,
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
