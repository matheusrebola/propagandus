package propagandus.painelservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.documents.PainelPerformance;

@Repository
public interface PainelPerformanceRepository extends MongoRepository<PainelPerformance,Long>{

}
