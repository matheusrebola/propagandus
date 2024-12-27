package propagandus.viewservice.core.dtos;

import propagandus.viewservice.core.enumerators.EAttentionLevel;
import propagandus.viewservice.core.enumerators.EDayWeek;
import propagandus.viewservice.core.enumerators.EMonth;
import propagandus.viewservice.core.enumerators.EPeriodOfTheDay;
import propagandus.viewservice.core.enumerators.ESEx;

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
