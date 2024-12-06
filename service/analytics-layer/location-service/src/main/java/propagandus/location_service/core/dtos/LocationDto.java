package propagandus.location_service.core.dtos;

public record LocationDto(
  Long locationId,
  String zipCode,
  String publicPlace,
  String number,
  String city,
  String state,
  String counry,
  Long reactionId,
  Long painelId
) {

}
