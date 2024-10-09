package propagandus.api.core.dto;

import java.time.LocalDateTime;

import propagandus.api.core.model.Horario;
import propagandus.api.core.model.Pessoa;
import propagandus.api.core.model.enums.EAtencao;
import propagandus.api.core.model.enums.EReacao;

public record ReacaoCreateDto(
  EReacao tipoReacao,
  Pessoa pessoa,
  Horario horario,
  EAtencao nivelAtencao,
  LocalDateTime dataReacao
) {

}
