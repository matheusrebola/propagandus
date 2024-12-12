package propagandus.attentionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.attentionservice.core.views.AttentionByCityView;

public interface AttentionByCityRepository extends JpaRepository<AttentionByCityView, Long> {

}
