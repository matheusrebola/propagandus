package propagandus.datalake.core.models;

import java.time.DayOfWeek;
import java.time.Month;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import propagandus.datalake.core.models.enumerators.EPeriodOfTheDay;

@Entity(name = "period_register")
@Table(name = "date_time_table")
public record PeriodRegister(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "period_register_id") Long id,
  @Column(nullable = false) Byte day,
  @Enumerated(EnumType.STRING) @Column(length = 10, name = "day_week", nullable = false) DayOfWeek dayWeek,
  @Column(nullable = false) Byte hour,
  @Column(nullable = false) Byte minute,
  @Enumerated(EnumType.STRING) @Column(length = 5, name = "period_of_the_day", nullable = false) EPeriodOfTheDay periodOfTheDay,
  @Enumerated(EnumType.STRING) @Column(length = 10, nullable = false) Month month,
  @Column(length = 4, nullable = false) String year,
  @OneToOne(mappedBy = "attentionTime") Attention attention,
  @OneToOne(mappedBy = "reactionTime") Reaction reaction
  ) {
}
