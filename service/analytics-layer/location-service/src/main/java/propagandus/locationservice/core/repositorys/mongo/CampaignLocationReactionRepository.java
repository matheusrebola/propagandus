package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.locationservice.core.documents.CampaignLocationReaction;

public interface CampaignLocationReactionRepository extends MongoRepository<CampaignLocationReaction, Long> {

}
