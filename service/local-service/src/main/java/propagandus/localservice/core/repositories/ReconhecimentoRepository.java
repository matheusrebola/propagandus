package propagandus.localservice.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import propagandus.localservice.core.documents.Reconhecimento;

@Repository
public interface ReconhecimentoRepository extends JpaRepository<Reconhecimento, String> {
}
