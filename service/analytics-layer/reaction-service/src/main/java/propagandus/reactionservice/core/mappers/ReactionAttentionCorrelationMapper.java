package propagandus.reactionservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.documents.ReactionAttentionCorrelation;
import propagandus.reactionservice.core.dtos.ReactionAttentionCorrelationDTO;

@Component
@RequiredArgsConstructor
public class ReactionAttentionCorrelationMapper {
  private final ModelMapper modelMapper;

  public ReactionAttentionCorrelation map(ReactionAttentionCorrelationDTO dto){
    ReactionAttentionCorrelation reaction = modelMapper.map(dto, ReactionAttentionCorrelation.class);
    return reaction;
  }
}
