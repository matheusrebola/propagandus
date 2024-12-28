package propagandus.attentionservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.documents.AttentionByAudience;
import propagandus.attentionservice.core.dtos.AttentionByAudienceDTO;

@Component
@RequiredArgsConstructor
public class AttentionByAudienceMapper {
  private final ModelMapper modelMapper;

  public AttentionByAudience map(AttentionByAudienceDTO dto){
    AttentionByAudience attentionByAudience = modelMapper.map(dto, AttentionByAudience.class);
    return attentionByAudience;
  }
}