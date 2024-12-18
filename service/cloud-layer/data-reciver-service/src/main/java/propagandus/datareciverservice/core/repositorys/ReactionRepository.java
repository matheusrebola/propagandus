package propagandus.datareciverservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.datareciverservice.core.documents.Reaction;

@Repository
public interface ReactionRepository extends MongoRepository<Reaction,Integer> {

}
