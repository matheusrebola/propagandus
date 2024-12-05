package propagandus.analiticsservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.Painel;
import propagandus.analiticsservice.core.models.enumerators.EStatus;

@Repository
public interface PainelRepository extends JpaRepository<Painel, Long> {
  String findByIdentification(String identification);
  EStatus findByStatus(EStatus status);
  List<String> findByModel(String model);
}
