package propagandus.datapersistenceservice.core.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EDayWeek;
import propagandus.datapersistenceservice.core.models.enumerators.EMonth;
import propagandus.datapersistenceservice.core.models.enumerators.EPeriodOfTheDay;

public record PeriodRegisterCreateDto(
  @NotNull Byte day,
  @NotNull EDayWeek dayWeek,
  @NotNull Byte hour,
  @NotNull Byte minute,
  @NotNull EPeriodOfTheDay periodOfTheDay,
  @NotNull EMonth month,
  @NotNull String year,
  @NotNull LocalDateTime registerTime,
  @NotNull Long attentionId,
  @NotNull Long reactionId,
  @NotNull Long advertisingId
) {

}
