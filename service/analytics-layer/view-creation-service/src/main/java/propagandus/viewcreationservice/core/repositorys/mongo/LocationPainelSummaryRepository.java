package propagandus.viewcreationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.viewcreationservice.core.documents.LocationPainelSummary;

public interface LocationPainelSummaryRepository extends MongoRepository<LocationPainelSummary, Long>{

}
