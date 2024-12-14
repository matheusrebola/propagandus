package propagandus.datapersistenceservice.core.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record LocationCreateDto(
  @NotNull Long reactionId,
  @NotNull UUID painelId
) {

}
