package propagandus.analiticsservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.PeriodRegister;

@Repository
public interface PeriodTypeRepository extends JpaRepository<PeriodRegister, Long> {

}
