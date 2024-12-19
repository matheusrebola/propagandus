package propagandus.periodregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.views.PeriodRegisterView;

@Repository
public interface PeriodRegisterRepository extends JpaRepository<PeriodRegister,Long>, PeriodRegisterView {
  
}