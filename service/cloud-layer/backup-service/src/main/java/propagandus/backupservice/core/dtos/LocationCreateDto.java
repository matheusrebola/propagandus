package propagandus.backupservice.core.dtos;

public record LocationCreateDto(
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
