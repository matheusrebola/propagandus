package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.documents.ProductPreferences;

@Repository
public interface ProductPreferencesRepository extends MongoRepository<ProductPreferences,Long>{}
