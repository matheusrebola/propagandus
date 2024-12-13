package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.documents.LocationsByCityWithPositiveReactions;

@Repository
public interface LocationsByCityWithPositiveReactionsRepository extends MongoRepository<LocationsByCityWithPositiveReactions,Long> {

}
