package propagandus.registerservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.registerservice.core.documents.Attention;

@Repository
public interface AttentionRepository extends MongoRepository<Attention,Long> {

}
