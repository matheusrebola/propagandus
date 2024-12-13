package propagandus.locationservice.core.dtos;

import propagandus.locationservice.core.models.enumerators.EStatus;

public record PainelDTO(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
