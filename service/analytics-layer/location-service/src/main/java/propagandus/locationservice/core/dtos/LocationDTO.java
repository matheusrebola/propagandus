package propagandus.locationservice.core.dtos;

public record LocationDTO(
  Long locationId,
  String zipCode,
  String publicPlace,
  String number,
  String city,
  String state,
  String country,
  Long reactionId,
  Long painelId
) {

}
