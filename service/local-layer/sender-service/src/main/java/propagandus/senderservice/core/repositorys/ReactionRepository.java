package propagandus.senderservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.senderservice.core.models.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction,Integer> {
}
