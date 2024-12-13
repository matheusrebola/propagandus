package propagandus.advertisingservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.documents.CityWithReactions;

@Repository
public interface CityWithReactionsRepository extends MongoRepository<CityWithReactions,Long> {

}
