package propagandus.analyticsservice.core.dtos;

public record AdvertisingDto(
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
