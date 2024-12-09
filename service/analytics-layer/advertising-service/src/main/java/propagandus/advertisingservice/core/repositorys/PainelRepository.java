package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.models.Painel;

@Repository
public interface PainelRepository extends JpaRepository<Painel, Long> {
}
