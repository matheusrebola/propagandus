package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.models.Reaction;
import propagandus.reactionservice.core.views.ReactionAttentionCorrelationView;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction,Long>,ReactionAttentionCorrelationView {
}
