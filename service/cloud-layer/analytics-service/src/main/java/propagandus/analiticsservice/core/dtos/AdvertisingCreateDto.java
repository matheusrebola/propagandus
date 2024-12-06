package propagandus.analiticsservice.core.dtos;

public record AdvertisingCreateDto(
  String name,
  String version,
  String company,
  String product,
  Long reactionId
  ) {

}
