package propagandus.attentionservice.core.dtos;

import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.attentionservice.core.models.enumerators.ESEx;

public record AttentionByAudienceDTO(
  EAttentionLevel attentionLevel,
  ESEx peopleSex,
  Integer totalLooks,
  Integer totalPeople,
  EDayWeek dayWeek,
  EPeriodOfTheDay periodOfTheDay,
  EMonth month,
  String year
) {

}
