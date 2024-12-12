package propagandus.attentionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.attentionservice.core.views.PeopleByAttentionTypeView;

public interface PeopleByAttentionTypeRepository extends JpaRepository<PeopleByAttentionTypeView, Long> {

}
