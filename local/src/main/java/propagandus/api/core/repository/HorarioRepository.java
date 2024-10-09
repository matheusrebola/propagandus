package propagandus.api.core.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.api.core.model.Horario;
import propagandus.api.core.model.enums.EHorario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, UUID>{
  
  List<Horario> FindByHorario(EHorario horario);
}
