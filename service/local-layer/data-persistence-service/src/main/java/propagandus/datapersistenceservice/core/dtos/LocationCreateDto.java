package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;

public record LocationCreateDto(
  @NotNull String cityZone,
  @NotNull String zipCode,
  @NotNull String publicPlace,
  @NotNull String number,
  @NotNull String city,
  @NotNull String state,
  @NotNull String counry,
  @NotNull Long reactionId,
  @NotNull Long painelId
) {

}
