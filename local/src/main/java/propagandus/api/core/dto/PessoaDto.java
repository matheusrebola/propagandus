package propagandus.api.core.dto;

import java.util.UUID;

import propagandus.api.core.model.enums.EIdade;
import propagandus.api.core.model.enums.EPessoa;

public record PessoaDto(
  UUID id,
  EPessoa tipoPessoa,
  EIdade tipoIdade
) {

}
