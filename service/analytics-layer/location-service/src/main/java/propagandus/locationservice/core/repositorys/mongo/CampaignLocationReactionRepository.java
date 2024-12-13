package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.documents.CampaignLocationReaction;

@Repository
public interface CampaignLocationReactionRepository extends MongoRepository<CampaignLocationReaction, Long> {

}
