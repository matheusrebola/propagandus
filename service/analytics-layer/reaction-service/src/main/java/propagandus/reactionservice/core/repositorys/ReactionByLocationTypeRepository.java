package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.reactionservice.core.views.ReactionByLocationType;

public interface ReactionByLocationTypeRepository extends JpaRepository<ReactionByLocationType, Long> {

}
