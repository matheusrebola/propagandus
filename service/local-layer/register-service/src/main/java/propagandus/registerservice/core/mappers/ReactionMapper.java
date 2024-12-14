package propagandus.registerservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.Reaction;
import propagandus.registerservice.core.dtos.ReactionCreateDTO;
import propagandus.registerservice.core.dtos.ReactionDTO;

@Component
@RequiredArgsConstructor
public class ReactionMapper {
  private final ModelMapper modelMapper;

  public Reaction map(ReactionCreateDTO dto){
    Reaction reaction = modelMapper.map(dto, Reaction.class);
    return reaction;
  }
  public ReactionDTO map(Reaction reaction){
    ReactionDTO dto = modelMapper.map(reaction, ReactionDTO.class);
    return dto;
  }
}
