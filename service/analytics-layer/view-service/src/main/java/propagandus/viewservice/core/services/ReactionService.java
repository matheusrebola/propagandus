package propagandus.viewservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.ReactionAttentionCorrelation;
import propagandus.viewservice.core.repositorys.ReactionAttentionCorrelationRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private final ReactionAttentionCorrelationRepository reactionAttentionCorrelationRepository;

  public List<ReactionAttentionCorrelation> reactionAttentionCorrelation(){
    return reactionAttentionCorrelationRepository.findAll();
  }
}