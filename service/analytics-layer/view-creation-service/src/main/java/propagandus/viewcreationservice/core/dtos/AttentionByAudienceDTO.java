package propagandus.viewcreationservice.core.dtos;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EDayWeek;
import propagandus.viewcreationservice.core.models.enumerators.EMonth;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

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
