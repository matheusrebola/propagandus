package propagandus.reactionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.documents.ReactionsByAdvertisingVersion;

@Repository
public interface ReactionsByAdvertisingVersionRepository extends MongoRepository<ReactionsByAdvertisingVersion,Long>{

}
