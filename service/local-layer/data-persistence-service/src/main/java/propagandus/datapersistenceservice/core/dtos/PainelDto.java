package propagandus.datapersistenceservice.core.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record PainelDto(
  @NotNull UUID painelId,
  @NotNull UUID locationId,
  @NotNull UUID advertisingId,
  @NotNull Long attentionId,
  @NotNull Long reactionId,
  @NotNull Long packageTypeId
) {

}
