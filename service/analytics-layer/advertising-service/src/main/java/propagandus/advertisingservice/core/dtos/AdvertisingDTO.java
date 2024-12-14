package propagandus.advertisingservice.core.dtos;

public record AdvertisingDTO(
  Long advertisingId,
  String name,
  String version,
  String company,
  String product,
  Long reactionId,
  Long periodRegisterId,
  Long painelId
) {

}
