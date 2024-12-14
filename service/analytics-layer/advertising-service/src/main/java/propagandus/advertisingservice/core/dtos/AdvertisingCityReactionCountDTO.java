package propagandus.advertisingservice.core.dtos;

public record AdvertisingCityReactionCountDTO(
  Long advertisingId,
  String advertisingName,
  String city,
  Long totalReactions
){
}
