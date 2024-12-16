package propagandus.registerservice.core.dtos;

import java.time.LocalDateTime;

public record PeriodRegisterDTO(
  Integer id,
  LocalDateTime registerTime
) {

}
