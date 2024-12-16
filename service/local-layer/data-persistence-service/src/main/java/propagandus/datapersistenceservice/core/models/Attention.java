package propagandus.datapersistenceservice.core.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EAttentionLevel;
import propagandus.datapersistenceservice.core.models.enumerators.ESEx;

@Entity(name = "attention")
@Table(name = "attention_table")
public record Attention(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "attention_id") Long id,
  @Enumerated(EnumType.STRING) @NotNull EAttentionLevel attention,
  @Column(name = "attention_level") @NotNull Byte attentionLevel,
  @Column(name = "look_count") @NotNull Short lookCount,
  @Column(name = "people_count") @NotNull Short peopleCount,
  @Column(name = "people_sex") @Enumerated(EnumType.STRING) @NotNull ESEx sex,
  @OneToOne @JoinColumn(name = "attention_time_id", referencedColumnName = "period_register_id", nullable = false) PeriodRegister attentionTime,
  @Column(name="painel_id", nullable=false) UUID painel
) {

}
