package propagandus.advertisingservice.core.dtos;

import propagandus.advertisingservice.core.models.enumerators.EReactionType;

public record AdvertisingReactionTypeCountDTO(
  Long advertisingId,
  String advertisingName,
  EReactionType reactionType,
  Long totalReactions
) {

}
