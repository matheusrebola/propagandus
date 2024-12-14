package propagandus.datapersistenceservice.core.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.datapersistenceservice.core.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, UUID> {
}
