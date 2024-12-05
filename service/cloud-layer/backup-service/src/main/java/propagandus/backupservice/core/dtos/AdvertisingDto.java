package propagandus.backupservice.core.dtos;

public record AdvertisingDto(
  Long advertisingId,
  String name,
  String version,
  String company,
  String product,
  Long reactionId
) {

}
