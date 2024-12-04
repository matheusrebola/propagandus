package propagandus.analiticsservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
