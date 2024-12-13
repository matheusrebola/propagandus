package propagandus.attentionservice.core.dtos;

import propagandus.attentionservice.core.models.enumerators.EStatus;

public record PainelDTO(
  Long painelId,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
