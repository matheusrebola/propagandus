package propagandus.registerservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.Reaction;
import propagandus.registerservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private final ReactionRepository reactionRepository;
  public Reaction insert(Reaction reaction){return reactionRepository.insert(reaction);}
  public List<Reaction> findAll(){return reactionRepository.findAll();}
}
