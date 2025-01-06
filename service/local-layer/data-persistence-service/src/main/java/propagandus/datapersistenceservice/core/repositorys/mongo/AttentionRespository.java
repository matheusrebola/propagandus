package propagandus.datapersistenceservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.datapersistenceservice.core.documents.Attention;

@Repository
public interface AttentionRespository extends MongoRepository<Attention, Integer>{

}
