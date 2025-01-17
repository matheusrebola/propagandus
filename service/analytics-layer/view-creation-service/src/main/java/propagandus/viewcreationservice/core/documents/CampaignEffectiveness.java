package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EDayWeek;
import propagandus.viewcreationservice.core.models.enumerators.EMonth;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

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