package propagandus.senderservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.senderservice.core.models.Attention;

@Repository
public interface AttentionRepository extends JpaRepository<Attention,Integer> {

}
