package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.locationservice.core.documents.LocationReactionSummary;

public interface LocationReactionSummaryRepository extends MongoRepository<LocationReactionSummary,Long> {

}
