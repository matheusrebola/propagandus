package propagandus.attentionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.attentionservice.core.models.enumerators.ESEx;

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
