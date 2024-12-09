package propagandus.painelservice.core.models;

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
import propagandus.painelservice.core.models.enumerators.EAttentionLevel;

@Entity(name = "attention")
@Table(name = "attention_table")
public record Attention(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "attention_id") Long id,
  @Enumerated(EnumType.STRING) @NotNull EAttentionLevel attention,
  @Column(name = "attention_level") @NotNull Byte attentionLevel,
  @Column(name = "look_count") @NotNull Short lookCount,
  @Column(name = "people_count") @NotNull Short peopleCount,
  @OneToOne @JoinColumn(name = "attention_time_id", referencedColumnName = "period_register_id", nullable = false) PeriodRegister attentionTime,
  @ManyToOne @JoinColumn(name="painel_id", nullable=false) Painel painel
) {

}
