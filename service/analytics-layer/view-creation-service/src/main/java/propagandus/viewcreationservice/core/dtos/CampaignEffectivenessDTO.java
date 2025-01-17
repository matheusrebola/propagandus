package propagandus.viewcreationservice.core.dtos;

import java.time.DayOfWeek;
import java.time.Month;

import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.EReactionType;

public record CampaignEffectivenessDTO(
  Long advertisingId,
  String advertisingName,
  EReactionType reactionType,
  Byte reactionScale,
  DayOfWeek dayWeek,
  EPeriodOfTheDay periodOfTheDay,
  Month month,
  String year
){}