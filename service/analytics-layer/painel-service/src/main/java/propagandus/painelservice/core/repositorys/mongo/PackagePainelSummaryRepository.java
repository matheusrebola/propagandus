package propagandus.painelservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.documents.PackagePainelSummary;

@Repository
public interface PackagePainelSummaryRepository extends MongoRepository<PackagePainelSummary,Long> {

}