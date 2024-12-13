package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record TotalLooksForPainelInWeek(
  @Id Long id,
  Integer totalLooks
) {

}
