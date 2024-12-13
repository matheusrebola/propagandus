package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.documents.LocationsWithReactionsByProduct;

@Repository
public interface LocationsWithReactionsByProductRepository extends MongoRepository<LocationsWithReactionsByProduct,Long> {

}
