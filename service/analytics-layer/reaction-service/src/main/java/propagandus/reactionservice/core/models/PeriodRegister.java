package propagandus.reactionservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import propagandus.reactionservice.core.models.enumerators.EDayWeek;
import propagandus.reactionservice.core.models.enumerators.EMonth;
import propagandus.reactionservice.core.models.enumerators.EPeriodOfTheDay;

@Entity(name = "period_register")
@Table(name = "date_time_table")
public record PeriodRegister(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "period_register_id") Long id,
  @NotNull Byte day,
  @Enumerated(EnumType.STRING) @Column(length = 3) @NotNull EDayWeek dayWeek,
  @NotNull Byte hour,
  @NotNull Byte minute,
  @Enumerated(EnumType.STRING) @Column(length = 5) @NotNull EPeriodOfTheDay periodOfTheDay,
  @Enumerated(EnumType.STRING) @Column(length = 3) @NotNull EMonth month,
  @Column(length = 4) @NotNull String year,
  @NotNull LocalDateTime registerTime,
  @OneToOne(mappedBy = "attentionTime") Attention attention,
  @OneToOne(mappedBy = "reactionTime") Reaction reaction,
  @ManyToOne @JoinColumn(name="advertising_id", nullable=false) Advertising advertising
  ) {
}
