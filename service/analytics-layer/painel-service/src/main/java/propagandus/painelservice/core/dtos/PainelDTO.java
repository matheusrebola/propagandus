package propagandus.painelservice.core.dtos;

import propagandus.painelservice.core.models.enumerators.EStatus;

public record PainelDTO(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
