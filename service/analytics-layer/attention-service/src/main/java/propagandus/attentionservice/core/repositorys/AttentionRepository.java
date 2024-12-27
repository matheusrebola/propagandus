package propagandus.attentionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.attentionservice.core.models.Attention;
import propagandus.attentionservice.core.views.AttentionByAudienceView;

@Repository
public interface AttentionRepository extends JpaRepository<Attention,Long>, AttentionByAudienceView {
  
}

