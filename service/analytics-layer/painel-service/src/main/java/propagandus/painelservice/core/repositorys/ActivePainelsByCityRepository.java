package propagandus.painelservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.painelservice.core.views.ActivePainelsByCityView;

public interface ActivePainelsByCityRepository extends JpaRepository<ActivePainelsByCityView, Long> {

}
