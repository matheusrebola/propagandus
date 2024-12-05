package propagandus.analiticsservice.core.dtos;

public record AdvertisingDto(
  Long advertisingId,
  String name,
  String version,
  String company,
  String product,
  Long reactionId
) {

}
