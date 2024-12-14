package propagandus.advertisingservice.core.dtos;

public record AdvertisingReactionCountDTO(
  Long advertisingId,
  String advertisingName,
  Long totalReactions
) {

}
