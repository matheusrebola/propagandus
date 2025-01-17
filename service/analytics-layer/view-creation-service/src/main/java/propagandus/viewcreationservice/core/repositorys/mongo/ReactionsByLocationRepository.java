package propagandus.viewcreationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.viewcreationservice.core.documents.ReactionsByLocation;

public interface ReactionsByLocationRepository extends MongoRepository<ReactionsByLocation, Long> {

}
