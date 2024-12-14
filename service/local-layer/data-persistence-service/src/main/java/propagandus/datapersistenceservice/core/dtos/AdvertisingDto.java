package propagandus.datapersistenceservice.core.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record AdvertisingDto(
  @NotNull UUID advertisingId,
  @NotNull Long reactionId,
  @NotNull Long periodRegisterId,
  @NotNull UUID painelId
) {

}
