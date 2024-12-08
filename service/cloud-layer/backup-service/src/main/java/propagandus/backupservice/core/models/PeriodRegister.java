package propagandus.backupservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import propagandus.backupservice.core.models.enumerators.EDayWeek;
import propagandus.backupservice.core.models.enumerators.EMonth;
import propagandus.backupservice.core.models.enumerators.EPeriodOfTheDay;

@Entity(name = "period_register")
@Table(name = "date_time_table")
public record PeriodRegister(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "period_register_id") Long id,
  Byte day,
  @Enumerated(EnumType.STRING) @Column(length = 3) EDayWeek dayWeek,
  Byte hour,
  Byte minute,
  @Enumerated(EnumType.STRING) @Column(length = 5) EPeriodOfTheDay periodOfTheDay,
  @Enumerated(EnumType.STRING) @Column(length = 3) EMonth month,
  @Column(length = 4) String year,
  LocalDateTime registerTime
  ) {
}
