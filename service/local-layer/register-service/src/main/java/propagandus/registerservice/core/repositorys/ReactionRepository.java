package propagandus.registerservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.registerservice.core.documents.Reaction;

@Repository
public interface ReactionRepository extends MongoRepository<Reaction,Integer> {

}
