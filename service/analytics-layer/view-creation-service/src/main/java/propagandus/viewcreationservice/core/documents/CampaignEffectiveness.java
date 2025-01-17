package propagandus.viewcreationservice.core.documents;

import java.time.DayOfWeek;
import java.time.Month;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

@Document
public record CampaignEffectiveness(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  EReactionType reactionType,
  Byte reactionScale,
  DayOfWeek dayWeek,
  EPeriodOfTheDay periodOfTheDay,
  Month month,
  String year
){}