package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record AverageAttentionByCity(
  @Id Long id,
  Long painelId,
  String location,
  Double avgAttention
) {

}
