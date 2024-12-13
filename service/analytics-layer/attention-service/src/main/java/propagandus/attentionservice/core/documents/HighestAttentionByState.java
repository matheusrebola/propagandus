package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record HighestAttentionByState(
  @Id Long id,
  String category, // Pode ser modelo ou estado
  Double maxAttention
) {

}
