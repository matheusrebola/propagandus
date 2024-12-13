package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;
import propagandus.attentionservice.core.models.enumerators.EStatus;

public record PainelsWithAttentionAboveThreshold(
  @Id Long id,
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
