package propagandus.advertisingservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import propagandus.advertisingservice.core.models.enumerators.EDayWeek;
import propagandus.advertisingservice.core.models.enumerators.EMonth;
import propagandus.advertisingservice.core.models.enumerators.EPeriodOfTheDay;

@Entity(name = "period_register")
@Table(name = "date_time_table")
public record PeriodRegister(
  @Id @Column(name = "period_register_id") Long id,
  @NotNull Byte day,
  @Enumerated(EnumType.STRING) @Column(length = 3, name = "day_week") @NotNull EDayWeek dayWeek,
  @NotNull Byte hour,
  @NotNull Byte minute,
  @Enumerated(EnumType.STRING) @Column(length = 5, name = "period_of_the_day") @NotNull EPeriodOfTheDay periodOfTheDay,
  @Enumerated(EnumType.STRING) @Column(length = 3) @NotNull EMonth month,
  @Column(length = 4) @NotNull String year,
  @NotNull @Column(name = "register_time") LocalDateTime registerTime,
  @OneToOne(mappedBy = "attentionTime") Attention attention,
  @OneToOne(mappedBy = "reactionTime") Reaction reaction,
  @ManyToOne @JoinColumn(name="advertising_id", nullable=false) Advertising advertising
  ) {
}
