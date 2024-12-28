package propagandus.viewservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewservice.core.documents.PainelPerformance;

@Repository
public interface PainelPerformanceRepository extends MongoRepository<PainelPerformance,Long>{

}
