package propagandus.viewcreationservice.core.models;

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
import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

@Entity(name = "attention")
@Table(name = "attention_table")
public record Attention(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "attention_id") Long id,
  @Enumerated(EnumType.STRING) @Column(name = "attention_level", nullable = false) EAttentionLevel attentionLevel,
  @Column(name = "attention_value", nullable = false) Byte attentionValue,
  @Column(name = "look_count", nullable = false) Long lookCount,
  @Column(name = "people_count", nullable = false) Long peopleCount,
  @Enumerated(EnumType.STRING) @Column(name = "people_sex", nullable = false) ESEx sex,
  @OneToOne @JoinColumn(name = "attention_time_id", referencedColumnName = "period_register_id", nullable = false) PeriodRegister attentionTime,
  @ManyToOne @JoinColumn(name="location_id", nullable=false) Location location,
  @ManyToOne @JoinColumn(name="advertising_id", nullable=false) Advertising advertising,
  @ManyToOne @JoinColumn(name="painel_id", nullable=false) Painel painel
) {

}
