package propagandus.reactionservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.documents.ReactionAttentionCorrelation;
import propagandus.reactionservice.core.dtos.ReactionAttentionCorrelationDTO;
import propagandus.reactionservice.core.mappers.ReactionAttentionCorrelationMapper;
import propagandus.reactionservice.core.repositorys.ReactionAttentionCorrelationRepository;
import propagandus.reactionservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private final ReactionRepository reactionRepository;
  private final ReactionAttentionCorrelationMapper reactionAttentionCorrelationMapper;
  private final ReactionAttentionCorrelationRepository reactionAttentionCorrelationRepository;
  
  List<ReactionAttentionCorrelation> locationPerformance(){
    List<ReactionAttentionCorrelationDTO> dtoList = reactionRepository.reactionAttentionCorrelation();
    List<ReactionAttentionCorrelation> reactions = dtoList.stream()
      .map(reactionAttentionCorrelationMapper::map)
      .toList();
    List<ReactionAttentionCorrelation> savedReaction = reactionAttentionCorrelationRepository.saveAll(reactions);
    return savedReaction;
  }
}
