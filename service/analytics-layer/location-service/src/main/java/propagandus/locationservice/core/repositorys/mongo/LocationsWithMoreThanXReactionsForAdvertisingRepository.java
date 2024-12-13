package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.documents.LocationsWithMoreThanXReactionsForAdvertising;

@Repository
public interface LocationsWithMoreThanXReactionsForAdvertisingRepository extends MongoRepository<LocationsWithMoreThanXReactionsForAdvertising,Long> {

}
