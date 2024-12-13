package propagandus.periodregisterservice.core.dtos;

import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public record RegisterCountByDateDTO(
  String year,
  EMonth month,
  Byte day,
  Integer registerCount
) {

}
