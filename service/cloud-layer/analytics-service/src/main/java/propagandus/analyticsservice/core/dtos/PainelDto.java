package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EStatus;

public record PainelDto(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}