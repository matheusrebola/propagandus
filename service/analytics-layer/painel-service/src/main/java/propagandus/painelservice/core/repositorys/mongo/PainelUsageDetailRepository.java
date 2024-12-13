package propagandus.painelservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.documents.PainelUsageDetail;

@Repository
public interface PainelUsageDetailRepository extends MongoRepository<PainelUsageDetail,Long> {

}