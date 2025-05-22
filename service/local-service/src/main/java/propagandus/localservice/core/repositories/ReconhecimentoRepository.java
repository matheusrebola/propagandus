package propagandus.localservice.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import propagandus.localservice.core.documents.Reconhecimento;

@Repository
public interface ReconhecimentoRepository extends MongoRepository<Reconhecimento, String> {
}
