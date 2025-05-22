package propagandus.localservice.core.dtos;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record RespostaDTO(
    UUID id,
    LocalDateTime data
) {
}
