package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.models.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {
}
