package propagandus.staticregisterservice.core.dtos;

public record PainelDto(
  Long painelId,
  String identification,
  String model,
  Long locationId,
  Long packageTypeId
) {

}
