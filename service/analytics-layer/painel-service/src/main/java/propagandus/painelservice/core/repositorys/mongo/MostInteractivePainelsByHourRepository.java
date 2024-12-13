package propagandus.painelservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.documents.MostInteractivePainelsByHour;

@Repository
public interface MostInteractivePainelsByHourRepository extends MongoRepository<MostInteractivePainelsByHour,Long> {

}