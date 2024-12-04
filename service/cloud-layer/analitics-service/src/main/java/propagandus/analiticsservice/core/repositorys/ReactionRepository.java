package propagandus.analiticsservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {

}
