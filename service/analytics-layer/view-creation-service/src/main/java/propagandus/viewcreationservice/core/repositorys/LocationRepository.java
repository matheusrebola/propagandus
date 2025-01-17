package propagandus.locationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.models.Location;
import propagandus.locationservice.core.views.LocationPerformanceView;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long>,LocationPerformanceView {
 
}
