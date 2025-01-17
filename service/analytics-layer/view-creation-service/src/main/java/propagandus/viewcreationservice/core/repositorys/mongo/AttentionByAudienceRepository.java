package propagandus.viewcreationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.documents.AttentionByAudience;

@Repository
public interface AttentionByAudienceRepository extends MongoRepository<AttentionByAudience,Long>{

}
