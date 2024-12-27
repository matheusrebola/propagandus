package propagandus.reactionservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.dtos.ReactionAttentionCorrelationDTO;
import propagandus.reactionservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private final ReactionRepository reactionRepository;

  List<ReactionAttentionCorrelationDTO> reactionAttentionCorrelation(){
    return reactionRepository.reactionAttentionCorrelation();
  }
}
