package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.Reaction;
import propagandus.datapersistenceservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private ReactionRepository reactionRepository;
  public Reaction save(Reaction reaction){return reactionRepository.save(reaction);}
}
