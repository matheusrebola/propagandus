package propagandus.analyticsservice.core.dtos;

public record AdvertisingCreateDto(
  String name,
  String version,
  String company,
  String product,
  Long reactionId,
  Long periodRegisterId,
  Long painelId
  ) {

}
