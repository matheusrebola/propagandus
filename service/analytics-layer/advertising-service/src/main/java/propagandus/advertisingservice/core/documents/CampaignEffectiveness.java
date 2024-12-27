package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.advertisingservice.core.models.enumerators.EDayWeek;
import propagandus.advertisingservice.core.models.enumerators.EMonth;
import propagandus.advertisingservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;

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