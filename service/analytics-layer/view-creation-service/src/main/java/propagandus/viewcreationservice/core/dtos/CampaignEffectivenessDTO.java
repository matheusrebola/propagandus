package propagandus.viewcreationservice.core.dtos;

import propagandus.viewcreationservice.core.models.enumerators.EDayWeek;
import propagandus.viewcreationservice.core.models.enumerators.EMonth;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

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