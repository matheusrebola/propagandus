package propagandus.api.core.dto;

import java.util.UUID;

import propagandus.api.core.model.enums.EHorario;

public record HorarioDto(
  UUID id,
  EHorario tipoHorario
) {

}
