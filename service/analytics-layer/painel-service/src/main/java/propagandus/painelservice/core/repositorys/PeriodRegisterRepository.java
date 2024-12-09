package propagandus.painelservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.models.PeriodRegister;

@Repository
public interface PeriodRegisterRepository extends JpaRepository<PeriodRegister, Long> {
  
}