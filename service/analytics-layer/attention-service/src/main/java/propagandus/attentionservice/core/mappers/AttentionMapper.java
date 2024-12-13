package propagandus.attentionservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.dtos.AttentionCreateDto;
import propagandus.attentionservice.core.dtos.AttentionDto;
import propagandus.attentionservice.core.models.Attention;

@Component
@RequiredArgsConstructor
public class AttentionMapper {
  private final ModelMapper modelMapper;

  public Attention map(AttentionCreateDto dto){
    Attention attention = modelMapper.map(dto, Attention.class);
    return attention;
  }

  public AttentionDto map(Attention attention){
    AttentionDto dto = modelMapper.map(attention, AttentionDto.class);
    return dto;
  }
}
