package propagandus.viewservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewservice.core.enumerators.EDayWeek;
import propagandus.viewservice.core.enumerators.EMonth;
import propagandus.viewservice.core.enumerators.EPeriodOfTheDay;
import propagandus.viewservice.core.enumerators.EReactionType;

@Document
public record CampaignEffectiveness(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  EReactionType reactionType,
  Byte reactionScale,
  EDayWeek dayWeek,
  EPeriodOfTheDay periodOfTheDay,
  EMonth month,
  String year
){}