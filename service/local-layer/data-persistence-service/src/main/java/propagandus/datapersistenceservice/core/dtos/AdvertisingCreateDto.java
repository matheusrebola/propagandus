package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;

public record AdvertisingCreateDto(
  @NotNull String name,
  @NotNull String version,
  @NotNull String company,
  @NotNull String product,
  @NotNull Long reactionId,
  @NotNull Long periodRegisterId,
  @NotNull Long painelId
  ) {

}
