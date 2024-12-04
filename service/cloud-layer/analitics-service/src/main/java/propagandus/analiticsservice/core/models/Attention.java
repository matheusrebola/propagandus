package propagandus.analiticsservice.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import propagandus.analiticsservice.core.models.enumerators.EAttentionLevel;

@Entity(name = "attention")
@Table(name = "attention_table")
public record Attention(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "attention_id") Long id,
  @ManyToOne @JoinColumn(name="painel_id", nullable=false) Painel painel,
  @Enumerated(EnumType.STRING) EAttentionLevel attention,
  @Column(name = "attention_level") Byte attentionLevel,
  @Column(name = "look_count") Short lookCount,
  @Column(name = "people_count") Short peopleCount
) {

}
