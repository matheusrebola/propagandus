package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record AverageLooksByPainelAtHour(
  @Id Long id,
  Long painelId,
  String location,
  Double avgAttention
) {

}
