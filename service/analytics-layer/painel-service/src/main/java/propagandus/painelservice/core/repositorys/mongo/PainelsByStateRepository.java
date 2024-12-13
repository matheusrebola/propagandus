package propagandus.painelservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.documents.PainelsByState;

@Repository
public interface PainelsByStateRepository extends MongoRepository<PainelsByState,Long> {

}