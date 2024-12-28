package propagandus.viewservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewservice.core.enumerators.EAttentionLevel;
import propagandus.viewservice.core.enumerators.EDayWeek;
import propagandus.viewservice.core.enumerators.EMonth;
import propagandus.viewservice.core.enumerators.EPeriodOfTheDay;
import propagandus.viewservice.core.enumerators.ESEx;

@Document
public record AttentionByAudience(
  @Id Long id,
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
