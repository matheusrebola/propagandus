package propagandus.registerservice.core.dtos;

import java.time.LocalDateTime;

public record PeriodRegisterCreateDTO(
  LocalDateTime registerTime
) {

}
