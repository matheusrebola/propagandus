package propagandus.datareciverservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.datareciverservice.core.documents.Attention;

@Repository
public interface AttentionRepository extends MongoRepository<Attention,Integer> {

}
