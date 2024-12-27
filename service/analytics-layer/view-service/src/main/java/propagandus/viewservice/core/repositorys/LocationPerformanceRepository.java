package propagandus.viewservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewservice.core.documents.LocationPerformance;

@Repository
public interface LocationPerformanceRepository extends MongoRepository<LocationPerformance,Long>{

}
