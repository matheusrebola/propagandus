package propagandus.viewcreationservice.core.documents;

import java.time.DayOfWeek;
import java.time.Month;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

@Document
public record AttentionByAudience(
  @Id Long id,
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
