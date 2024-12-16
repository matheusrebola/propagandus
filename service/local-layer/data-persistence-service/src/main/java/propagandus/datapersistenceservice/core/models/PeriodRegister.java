package propagandus.datapersistenceservice.core.models;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "period_register")
@Table(name = "date_time_table")
public record PeriodRegister(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "period_register_id") Long id,
  @Column(name = "register_time") LocalDateTime registerTime,
  @Column(name = "advertising_id") UUID advertising
  ) {
}
