package propagandus.advertisingservice.core.dtos;

import propagandus.advertisingservice.core.models.enumerators.EDayWeek;
import propagandus.advertisingservice.core.models.enumerators.EMonth;
import propagandus.advertisingservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;

public record CampaignEffectivenessDTO(
  Long advertisingId,
  String advertisingName,
  EReactionType reactionType,
  Byte reactionScale,
  EDayWeek dayWeek,
  EPeriodOfTheDay periodOfTheDay,
  EMonth month,
  String year
){}