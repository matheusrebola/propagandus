package propagandus.viewcreationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.documents.ReactionAttentionCorrelation;

@Repository
public interface ReactionAttentionCorrelationRepository extends MongoRepository<ReactionAttentionCorrelation,Long>{

}
