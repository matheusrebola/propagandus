package propagandus.locationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.locationservice.core.views.CampaignLocationReactionView;

public interface CampaignLocationReactionRepository extends JpaRepository<CampaignLocationReactionView, Long> {

}
