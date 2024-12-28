package propagandus.viewservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewservice.core.documents.ProductPreferences;

@Repository
public interface ProductPreferencesRepository extends MongoRepository<ProductPreferences,Long>{}
