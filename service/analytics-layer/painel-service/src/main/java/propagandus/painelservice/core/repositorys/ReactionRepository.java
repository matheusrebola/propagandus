package propagandus.painelservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.models.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {
}
