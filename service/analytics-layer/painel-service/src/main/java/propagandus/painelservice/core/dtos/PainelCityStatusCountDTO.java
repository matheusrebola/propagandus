package propagandus.painelservice.core.dtos;

import propagandus.painelservice.core.models.enumerators.EStatus;

public record PainelCityStatusCountDTO(
  String city,
  EStatus status,
  Long painelCount
) {

}
