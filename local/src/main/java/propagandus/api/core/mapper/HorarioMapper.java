package propagandus.api.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.api.core.dto.HorarioCreateDto;
import propagandus.api.core.dto.HorarioDto;
import propagandus.api.core.model.Horario;

@Component
@RequiredArgsConstructor
public class HorarioMapper {
  private final ModelMapper modelMapper;

  public Horario map(HorarioCreateDto dto){
    Horario horario = modelMapper.map(dto, Horario.class);
    return horario;
  }

  public HorarioDto map(Horario horario){
    HorarioDto dto = modelMapper.map(horario, HorarioDto.class);
    return dto;
  }

}
