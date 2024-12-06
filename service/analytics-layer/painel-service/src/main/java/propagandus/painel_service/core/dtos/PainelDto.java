package propagandus.analiticsservice.core.dtos;

import propagandus.analiticsservice.core.models.enumerators.EStatus;

public record PainelDto(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
