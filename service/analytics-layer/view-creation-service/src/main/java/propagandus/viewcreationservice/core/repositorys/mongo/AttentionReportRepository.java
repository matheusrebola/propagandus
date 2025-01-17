package propagandus.viewcreationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.viewcreationservice.core.documents.AttentionReport;

public interface AttentionReportRepository extends MongoRepository<AttentionReport, Long> {

}
