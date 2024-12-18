package propagandus.datalake.core.dtos;

public record PainelCreateDto(
  String identification,
  String model,
  Long locationId,
  Long packageTypeId
) {

}
