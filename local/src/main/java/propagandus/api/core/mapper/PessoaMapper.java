package propagandus.api.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.api.core.dto.PessoaCreateDto;
import propagandus.api.core.dto.PessoaDto;
import propagandus.api.core.model.Pessoa;

@Component
@RequiredArgsConstructor
public class PessoaMapper {
  private final ModelMapper modelMapper;

  public Pessoa map(PessoaCreateDto dto){
    Pessoa pessoa = modelMapper.map(dto, Pessoa.class);
    return pessoa;
  }

  public PessoaDto map(Pessoa pessoa){
    PessoaDto dto = modelMapper.map(pessoa, PessoaDto.class);
    return dto;
  }

}
