package propagandus.painelservice.core.dtos;

public record PainelDTO(
  Long painelId,
  Long locationId,
  String identification,
  String model
) {

}
