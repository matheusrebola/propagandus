package propagandus.viewcreationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.viewcreationservice.core.documents.AdvertisingSummary;

public interface AdvertisingSummaryRepository extends MongoRepository<AdvertisingSummary, Long> {

}
