package propagandus.attentionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.attentionservice.core.views.AttentionAvgByPainelView;

public interface AttentionAvgByPainelRepository extends JpaRepository<AttentionAvgByPainelView, Long> {

}
