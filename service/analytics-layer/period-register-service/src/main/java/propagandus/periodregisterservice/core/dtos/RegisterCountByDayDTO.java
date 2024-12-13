package propagandus.periodregisterservice.core.dtos;

public record RegisterCountByDayDTO(
  Byte day,
  Short registerCount
) {

}
