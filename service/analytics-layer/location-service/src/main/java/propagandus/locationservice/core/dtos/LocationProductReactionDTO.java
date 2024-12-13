package propagandus.locationservice.core.dtos;

public record LocationProductReactionDTO(
  Long locationId,
  String city,
  String state,
  String product
) {

}
