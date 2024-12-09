package propagandus.locationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.models.Attention;

@Repository
public interface AttentionRepository extends JpaRepository<Attention, Long> {

}
