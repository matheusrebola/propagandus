package propagandus.painel_service.core.models;

import propagandus.painel_service.core.models.enumerators.EStatus;

public record Painel(
  Long id,
  Long locationId,
  String identification,
  EStatus status,
  String model
  ) {
}
