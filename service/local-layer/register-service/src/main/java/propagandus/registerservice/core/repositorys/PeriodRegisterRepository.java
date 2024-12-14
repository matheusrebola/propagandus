package propagandus.registerservice.core.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import propagandus.registerservice.core.documents.PeriodRegister;

@Repository
public interface PeriodRegisterRepository extends MongoRepository <PeriodRegister,Integer> {

}
