package propagandus.reactionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.documents.ReactionsByLocationAndPeriod;

@Repository
public interface ReactionsByLocationAndPeriodRepository extends MongoRepository<ReactionsByLocationAndPeriod,Long> {

}
