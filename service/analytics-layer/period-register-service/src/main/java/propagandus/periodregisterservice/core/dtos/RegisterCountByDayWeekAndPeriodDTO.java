package propagandus.periodregisterservice.core.dtos;

public record RegisterCountByDayWeekAndPeriodDTO(
  String dayWeek,
  String periodOfTheDay,
  Integer registerCount
) {

}
