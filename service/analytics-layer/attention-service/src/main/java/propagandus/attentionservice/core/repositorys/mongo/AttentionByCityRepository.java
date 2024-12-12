package propagandus.attentionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.attentionservice.core.documents.AttentionByCity;

public interface AttentionByCityRepository extends MongoRepository<AttentionByCity, Long>{

}
