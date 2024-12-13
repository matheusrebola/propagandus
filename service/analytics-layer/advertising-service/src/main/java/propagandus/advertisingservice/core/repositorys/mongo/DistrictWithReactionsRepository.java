package propagandus.advertisingservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.documents.StatetWithReactions;

@Repository
public interface DistrictWithReactionsRepository extends MongoRepository<StatetWithReactions,Long> {

}
