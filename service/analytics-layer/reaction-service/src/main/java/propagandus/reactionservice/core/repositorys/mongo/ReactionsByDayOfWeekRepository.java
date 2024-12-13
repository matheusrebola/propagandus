package propagandus.reactionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.documents.ReactionsByDayOfWeek;

@Repository
public interface ReactionsByDayOfWeekRepository extends MongoRepository<ReactionsByDayOfWeek,Long> {

}
