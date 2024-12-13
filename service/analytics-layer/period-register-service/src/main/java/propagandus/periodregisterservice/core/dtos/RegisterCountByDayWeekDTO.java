package propagandus.periodregisterservice.core.dtos;

public record RegisterCountByDayWeekDTO(
  String dayWeek,
  Integer registerCount
) {

}
