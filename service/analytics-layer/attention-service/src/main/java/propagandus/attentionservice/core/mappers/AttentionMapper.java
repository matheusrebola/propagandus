package propagandus.attentionservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.dtos.AttentionDTO;
import propagandus.attentionservice.core.models.Attention;

@Component
@RequiredArgsConstructor
public class AttentionMapper {
  private final ModelMapper modelMapper;

  public AttentionDTO map(Attention attention){
    AttentionDTO dto = modelMapper.map(attention, AttentionDTO.class);
    return dto;
  }
}
