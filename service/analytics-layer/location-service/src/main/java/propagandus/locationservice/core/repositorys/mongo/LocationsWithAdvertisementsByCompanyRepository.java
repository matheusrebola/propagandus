package propagandus.locationservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.documents.LocationsWithAdvertisementsByCompany;

@Repository
public interface LocationsWithAdvertisementsByCompanyRepository extends MongoRepository<LocationsWithAdvertisementsByCompany,Long> {

}
