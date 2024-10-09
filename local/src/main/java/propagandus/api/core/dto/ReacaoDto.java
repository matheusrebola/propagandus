package propagandus.api.core.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import propagandus.api.core.model.Horario;
import propagandus.api.core.model.Pessoa;
import propagandus.api.core.model.enums.EAtencao;
import propagandus.api.core.model.enums.EReacao;

public record ReacaoDto(
  UUID id,
  EReacao tipoReacao,
  Pessoa pessoa,
  Horario horario,
  EAtencao nivelAtencao,
  LocalDateTime dataReacao
) {

}
