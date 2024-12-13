package propagandus.locationservice.core.dtos;

public record LocationReactionCountDTO(
  String location, // Pode ser cidade ou estado
  Long count
) {

}
