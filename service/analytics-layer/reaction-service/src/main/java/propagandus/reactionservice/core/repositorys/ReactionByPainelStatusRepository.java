package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.reactionservice.core.views.ReactionByPainelStatus;

public interface ReactionByPainelStatusRepository extends JpaRepository<ReactionByPainelStatus, Long> {

}
