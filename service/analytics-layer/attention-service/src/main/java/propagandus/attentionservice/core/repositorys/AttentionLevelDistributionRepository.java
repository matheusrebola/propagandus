package propagandus.attentionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.attentionservice.core.views.AttentionLevelDistributionView;

public interface AttentionLevelDistributionRepository extends JpaRepository<AttentionLevelDistributionView, Long> {

}
