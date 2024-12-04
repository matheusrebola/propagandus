package propagandus.backupservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.backupservice.core.models.Reaction;
import propagandus.backupservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private final ReactionRepository reactionRepository;

  public List<Reaction> findAll(){return reactionRepository.findAll();}
  public Reaction findById(Long id){return reactionRepository.findById(id).orElse(null);}
  public Reaction save(Reaction reaction){return reactionRepository.save(reaction);}
}
