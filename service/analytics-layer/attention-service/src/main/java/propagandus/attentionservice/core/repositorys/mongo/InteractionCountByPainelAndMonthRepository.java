package propagandus.attentionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.attentionservice.core.documents.InteractionCountByPainelAndMonth;

@Repository
public interface InteractionCountByPainelAndMonthRepository extends MongoRepository<InteractionCountByPainelAndMonth,Long> {

}