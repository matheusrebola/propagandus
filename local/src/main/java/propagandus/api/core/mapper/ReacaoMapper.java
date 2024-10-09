package propagandus.api.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import propagandus.api.core.dto.ReacaoCreateDto;
import propagandus.api.core.dto.ReacaoDto;
import propagandus.api.core.model.Reacao;

@Component
public class ReacaoMapper {
  private ModelMapper modelMapper;

  public Reacao map(ReacaoCreateDto dto){
    Reacao reacao = modelMapper.map(dto, Reacao.class);
    return reacao;
  }

  public ReacaoDto map(Reacao reacao){
    ReacaoDto dto = modelMapper.map(reacao, ReacaoDto.class);
    return dto;
  }
  
}
