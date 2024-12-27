package propagandus.viewservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewservice.core.documents.ReactionAttentionCorrelation;

@Repository
public interface ReactionAttentionCorrelationRepository extends MongoRepository<ReactionAttentionCorrelation,Long>{

}