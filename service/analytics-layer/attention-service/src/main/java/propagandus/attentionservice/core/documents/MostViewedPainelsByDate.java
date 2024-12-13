package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record MostViewedPainelsByDate(
  @Id Long id,
  Long painelId,
  String location,
  Long totalAttention
) {

}
