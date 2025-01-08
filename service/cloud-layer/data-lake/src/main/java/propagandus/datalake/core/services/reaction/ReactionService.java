package propagandus.datalake.core.services.reaction;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.Reaction;
import propagandus.datalake.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private ReactionRepository reactionRepository;
  public Reaction save(Reaction reaction){return reactionRepository.save(reaction);}
}
