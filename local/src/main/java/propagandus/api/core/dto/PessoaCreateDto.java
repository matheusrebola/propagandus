package propagandus.api.core.dto;

import propagandus.api.core.model.enums.EIdade;
import propagandus.api.core.model.enums.EPessoa;

public record PessoaCreateDto(
  EPessoa tipoPessoa,
  EIdade tipoIdade
) {

}
