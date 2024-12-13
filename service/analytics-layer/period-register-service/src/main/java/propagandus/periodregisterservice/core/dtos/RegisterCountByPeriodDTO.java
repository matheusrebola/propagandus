package propagandus.periodregisterservice.core.dtos;

public record RegisterCountByPeriodDTO(
  String periodOfTheDay,
  Integer registerCount
) {

}
