package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EDayWeek;
import propagandus.viewcreationservice.core.models.enumerators.EMonth;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

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
