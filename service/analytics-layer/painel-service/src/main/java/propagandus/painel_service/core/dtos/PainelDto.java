package propagandus.painel_service.core.dtos;

import propagandus.painel_service.core.models.enumerators.EStatus;

public record PainelDto(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
