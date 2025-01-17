package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.documents.CampaignEffectiveness;

@Repository
public interface CampaignEffectivenessRepository extends MongoRepository<CampaignEffectiveness,Long> {}
