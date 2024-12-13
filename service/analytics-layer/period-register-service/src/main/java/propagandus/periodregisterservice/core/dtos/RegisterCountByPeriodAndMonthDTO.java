package propagandus.periodregisterservice.core.dtos;

import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public record RegisterCountByPeriodAndMonthDTO(
  String periodOfTheDay,
  EMonth month,
  Integer registerCount
){  
}

