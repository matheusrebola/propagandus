package propagandus.datalake.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.datalake.core.models.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction,Long> {
}
