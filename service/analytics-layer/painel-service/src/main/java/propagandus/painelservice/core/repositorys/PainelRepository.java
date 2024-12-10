package propagandus.painelservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.models.Painel;
import propagandus.painelservice.core.views.PainelView;

@Repository
public interface PainelRepository extends JpaRepository<Painel, Long>, PainelView {
}
