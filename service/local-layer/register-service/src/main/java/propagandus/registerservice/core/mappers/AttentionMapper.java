package propagandus.registerservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.Attention;
import propagandus.registerservice.core.dtos.AttentionCreateDTO;
import propagandus.registerservice.core.dtos.AttentionDTO;

@Component
@RequiredArgsConstructor
public class AttentionMapper {
  private final ModelMapper modelMapper;

  public Attention map(AttentionCreateDTO dto){
    Attention attention = modelMapper.map(dto, Attention.class);
    return attention;
  }
  public AttentionDTO map(Attention attention){
    AttentionDTO dto = modelMapper.map(attention, AttentionDTO.class);
    return dto;
  }
}
