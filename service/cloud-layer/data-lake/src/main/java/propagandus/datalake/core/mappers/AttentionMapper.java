package propagandus.datalake.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.dtos.AttentionCreateDto;
import propagandus.datalake.core.dtos.AttentionDto;
import propagandus.datalake.core.models.Attention;

@Component
@RequiredArgsConstructor
public class AttentionMapper {
  private ModelMapper modelMapper;

  public Attention map(AttentionCreateDto dto){
    Attention attention = modelMapper.map(dto, Attention.class);
    return attention;
  }

  public AttentionDto map(Attention attention){
    AttentionDto dto = modelMapper.map(attention, AttentionDto.class);
    return dto;
  }
}
