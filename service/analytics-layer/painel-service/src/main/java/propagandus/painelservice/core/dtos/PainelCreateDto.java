package propagandus.painelservice.core.dtos;

import propagandus.painelservice.core.models.enumerators.EStatus;

public record PainelCreateDto(
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
