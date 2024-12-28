package propagandus.viewservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewservice.core.documents.CampaignEffectiveness;

@Repository
public interface CampaignEffectivenessRepository extends MongoRepository<CampaignEffectiveness,Long> {}
