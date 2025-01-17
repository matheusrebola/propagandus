package propagandus.viewcreationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.models.Painel;
import propagandus.viewcreationservice.core.views.generics.PainelView;

@Repository
public interface PainelRepository extends JpaRepository<Painel,Long>, PainelView {
  
}
