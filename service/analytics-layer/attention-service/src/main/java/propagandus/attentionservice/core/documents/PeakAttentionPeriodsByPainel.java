package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

public record PeakAttentionPeriodsByPainel(
  @Id Long id,
  EPeriodOfTheDay period,
  Short totalAttention
) {

}
