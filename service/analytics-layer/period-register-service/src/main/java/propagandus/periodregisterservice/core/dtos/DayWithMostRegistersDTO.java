package propagandus.periodregisterservice.core.dtos;

public record DayWithMostRegistersDTO(
  Byte day,
  Short registerCount
) {

}
