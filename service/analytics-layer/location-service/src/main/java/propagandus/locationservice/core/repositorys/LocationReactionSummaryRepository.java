package propagandus.locationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.locationservice.core.views.LocationReactionSummaryView;

public interface LocationReactionSummaryRepository extends JpaRepository<LocationReactionSummaryView, Long> {

}
