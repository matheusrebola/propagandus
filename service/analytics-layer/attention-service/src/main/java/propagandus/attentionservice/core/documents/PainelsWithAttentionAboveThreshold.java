package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record PainelsWithAttentionAboveThreshold(
  @Id Long id,
  Long painelId,
  Long locationId,
  String identification,
  String model
) {

}
