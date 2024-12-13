package propagandus.advertisingservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.documents.ReactionsByProduct;

@Repository
public interface ReactionsByProductRepository extends MongoRepository<ReactionsByProduct,Long> {

}
