package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.reactionservice.core.views.AverageReactionByCampaign;

public interface AverageReactionByCampaignRepository extends JpaRepository<AverageReactionByCampaign, Long> {

}
