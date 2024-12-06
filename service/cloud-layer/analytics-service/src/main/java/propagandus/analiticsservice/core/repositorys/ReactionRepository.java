package propagandus.analiticsservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.Reaction;
import propagandus.analiticsservice.core.models.enumerators.EReactionType;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {
  List<EReactionType> findByReactionType(EReactionType reactionType);
}
