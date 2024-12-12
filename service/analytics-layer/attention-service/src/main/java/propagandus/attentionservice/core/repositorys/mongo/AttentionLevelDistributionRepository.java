package propagandus.attentionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.attentionservice.core.documents.AttentionLevelDistribution;

public interface AttentionLevelDistributionRepository extends MongoRepository<AttentionLevelDistribution, Long>{

}