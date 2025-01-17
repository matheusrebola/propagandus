package propagandus.viewcreationservice.core.dtos;

import java.time.DayOfWeek;
import java.time.Month;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

public record AttentionByAudienceDTO(
  EAttentionLevel attentionLevel,
  ESEx peopleSex,
  Integer totalLooks,
  Integer totalPeople,
  DayOfWeek dayWeek,
  EPeriodOfTheDay periodOfTheDay,
  Month month,
  String year
) {

}
