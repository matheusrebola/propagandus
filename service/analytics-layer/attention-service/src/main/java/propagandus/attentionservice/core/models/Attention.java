package propagandus.attentionservice.core.models;

import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;

public record Attention(
  Long id,
  Painel painel,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
