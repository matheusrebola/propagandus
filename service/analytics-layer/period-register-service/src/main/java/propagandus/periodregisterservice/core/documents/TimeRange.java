package propagandus.periodregisterservice.core.documents;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.periodregisterservice.core.models.enumerators.EDayWeek;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;
import propagandus.periodregisterservice.core.models.enumerators.EPeriodOfTheDay;

@Document
public record TimeRange(
  @Id Long id,
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
