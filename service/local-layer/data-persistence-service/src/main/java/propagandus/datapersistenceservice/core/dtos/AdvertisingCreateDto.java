package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;

public record AdvertisingCreateDto(
  @NotNull Long reactionId,
  @NotNull Long periodRegisterId,
  @NotNull Long painelId
  ) {

}
