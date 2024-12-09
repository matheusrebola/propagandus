package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.models.PeriodRegister;

@Repository
public interface PeriodRegisterRepository extends JpaRepository<PeriodRegister, Long> {
  
}