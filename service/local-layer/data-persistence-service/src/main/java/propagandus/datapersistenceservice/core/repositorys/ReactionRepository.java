package propagandus.datapersistenceservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.datapersistenceservice.core.models.Reaction;
import propagandus.datapersistenceservice.core.models.enumerators.EReactionType;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {
  List<EReactionType> findByReactionType(EReactionType reactionType);
}
