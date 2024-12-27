package propagandus.viewservice.core.dtos;

import propagandus.viewservice.core.enumerators.EDayWeek;
import propagandus.viewservice.core.enumerators.EMonth;
import propagandus.viewservice.core.enumerators.EPeriodOfTheDay;
import propagandus.viewservice.core.enumerators.EReactionType;

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