package propagandus.painelservice.core.dtos;

import propagandus.painelservice.core.models.enumerators.EStatus;

public record PainelStatusInteractionCountDTO(
  EStatus status,
  Long interactionCount
) {

}
