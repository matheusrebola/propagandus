package propagandus.reactionservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.models.Reaction;
import propagandus.reactionservice.core.models.enumerators.EReactionType;
import propagandus.reactionservice.core.views.ReactionView;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long>, ReactionView {
  List<EReactionType> findByReactionType(EReactionType reactionType);
}
