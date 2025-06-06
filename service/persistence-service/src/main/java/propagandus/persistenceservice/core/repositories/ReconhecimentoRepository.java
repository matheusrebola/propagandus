package propagandus.persistenceservice.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import propagandus.persistenceservice.core.models.Reconhecimento;

@Repository
public interface ReconhecimentoRepository extends JpaRepository<Reconhecimento,Long> {
}
