package propagandus.analyticsservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analyticsservice.core.models.PeriodRegister;

@Repository
public interface PeriodRegisterRepository extends JpaRepository<PeriodRegister, Long> {
  
}