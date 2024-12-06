package propagandus.attentionservice.core.models;

import propagandus.attentionservice.core.models.enumerators.EStatus;

public record Painel(
  Long id,
  Long locationId,
  String identification,
  EStatus status,
  String model
) {

}
