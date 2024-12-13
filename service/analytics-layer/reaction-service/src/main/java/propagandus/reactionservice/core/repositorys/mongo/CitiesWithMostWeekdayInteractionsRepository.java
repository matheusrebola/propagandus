package propagandus.reactionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.documents.CitiesWithMostWeekdayInteractions;

@Repository
public interface CitiesWithMostWeekdayInteractionsRepository extends MongoRepository<CitiesWithMostWeekdayInteractions,Long>{

}
