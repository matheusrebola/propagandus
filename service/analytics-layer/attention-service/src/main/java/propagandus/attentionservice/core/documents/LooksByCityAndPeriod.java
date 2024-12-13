package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

public record LooksByCityAndPeriod(
  @Id Long id,
  String city,
  EPeriodOfTheDay period,
  Long totalLooks
) {

}
