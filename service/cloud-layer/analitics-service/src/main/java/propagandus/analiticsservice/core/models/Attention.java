package propagandus.analiticsservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import propagandus.analiticsservice.core.models.enumerators.EAttentionLevel;

@Entity
public record Attention(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  @ManyToOne @JoinColumn(name="painel_id", nullable=false) Painel painel,
  @Enumerated(EnumType.STRING) EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
