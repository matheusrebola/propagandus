package propagandus.viewcreationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.models.Attention;
import propagandus.viewcreationservice.core.views.generics.AttentionView;

@Repository
public interface AttentionRepository extends JpaRepository<Attention,Long>, AttentionView {
  
}

