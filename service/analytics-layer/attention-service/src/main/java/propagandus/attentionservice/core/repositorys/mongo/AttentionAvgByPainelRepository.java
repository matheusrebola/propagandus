package propagandus.attentionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.attentionservice.core.documents.AttentionAvgByPainel;

public interface AttentionAvgByPainelRepository extends MongoRepository<AttentionAvgByPainel, Long>{

}
