package propagandus.backupservice.core.dtos;

import propagandus.backupservice.core.models.enumerators.EStatus;

public record PainelDto(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
