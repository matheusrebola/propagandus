package propagandus.attentionservice.core.repositorys.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import propagandus.attentionservice.core.documents.PeopleByAttentionType;

public interface PeopleByAttentionTypeRepository extends MongoRepository<PeopleByAttentionType, Long>{

}