package propagandus.attentionservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.attentionservice.core.documents.AttentionByAudience;

@Repository
public interface AttentionByAudienceRepository extends MongoRepository<AttentionByAudience,Long>{

}
