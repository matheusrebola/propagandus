package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
