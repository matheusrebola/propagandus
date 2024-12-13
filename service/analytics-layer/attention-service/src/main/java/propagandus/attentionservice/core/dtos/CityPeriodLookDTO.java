package propagandus.attentionservice.core.dtos;

import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

public record CityPeriodLookDTO(
  String city,
  EPeriodOfTheDay period,
  Long totalLooks
) {

}
