package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import propagandus.backupservice.core.models.enumerators.EAttentionLevel;

@Entity
public record Attention(
  @Id Long id,
  @ManyToOne Painel painel,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
