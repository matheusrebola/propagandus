package propagandus.periodregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.periodregisterservice.core.models.Attention;

@Repository
public interface AttentionRepository extends JpaRepository<Attention, Long> {

}
