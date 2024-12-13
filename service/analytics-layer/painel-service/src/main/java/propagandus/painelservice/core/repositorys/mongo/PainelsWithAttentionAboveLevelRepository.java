package propagandus.painelservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.documents.PainelsWithAttentionAboveLevel;

@Repository
public interface PainelsWithAttentionAboveLevelRepository extends MongoRepository<PainelsWithAttentionAboveLevel,Long> {

}