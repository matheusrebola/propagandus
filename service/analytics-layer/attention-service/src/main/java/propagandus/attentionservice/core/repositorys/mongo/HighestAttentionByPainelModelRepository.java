package propagandus.attentionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.attentionservice.core.documents.HighestAttentionByPainelModel;

@Repository
public interface HighestAttentionByPainelModelRepository extends MongoRepository<HighestAttentionByPainelModel,Long> {

}