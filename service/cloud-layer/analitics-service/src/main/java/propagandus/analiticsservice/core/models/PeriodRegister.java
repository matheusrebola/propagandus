package propagandus.analiticsservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import propagandus.analiticsservice.core.models.enumerators.EDayWeek;
import propagandus.analiticsservice.core.models.enumerators.EMonth;
import propagandus.analiticsservice.core.models.enumerators.EPeriodOfTheDay;

@Entity
public record PeriodRegister(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  Byte day,
  @Enumerated(EnumType.STRING) EDayWeek dayWeek,
  Byte hour,
  Byte minute,
  @Enumerated(EnumType.STRING) EPeriodOfTheDay periodOfTheDay,
  @Enumerated(EnumType.STRING) EMonth month,
  String year,
  LocalDateTime registerTime
  ) {
}
