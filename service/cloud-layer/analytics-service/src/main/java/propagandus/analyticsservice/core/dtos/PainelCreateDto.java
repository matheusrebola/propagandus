package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EStatus;

public record PainelCreateDto(
  String identification,
  EStatus status,
  String model,
  Long locationId,
  Long advertisingId,
  Long attentionId,
  Long reactionId,
  Long packageTypeId
) {

}
