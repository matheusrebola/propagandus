package propagandus.backupservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import propagandus.backupservice.core.models.enumerators.EDayWeek;
import propagandus.backupservice.core.models.enumerators.EMonth;
import propagandus.backupservice.core.models.enumerators.EPeriodOfTheDay;

@Entity
public record PeriodRegister(
  @Id Long id,
  Byte day,
  @Enumerated EDayWeek dayWeek,
  Byte hour,
  Byte minute,
  @Enumerated EPeriodOfTheDay periodOfTheDay,
  @Enumerated EMonth month,
  String year,
  LocalDateTime registerTime
  ) {
}
