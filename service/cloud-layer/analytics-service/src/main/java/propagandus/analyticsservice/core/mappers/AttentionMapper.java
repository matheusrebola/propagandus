package propagandus.analyticsservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.analyticsservice.core.dtos.AttentionCreateDto;
import propagandus.analyticsservice.core.dtos.AttentionDto;
import propagandus.analyticsservice.core.models.Attention;

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
