package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.reactionservice.core.views.ReactionByPeriod;

public interface ReactionByPeriodRepository extends JpaRepository<ReactionByPeriod, Long> {

}
