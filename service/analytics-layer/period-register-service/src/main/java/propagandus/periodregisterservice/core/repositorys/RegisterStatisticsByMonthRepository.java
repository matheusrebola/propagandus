package propagandus.periodregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.periodregisterservice.core.views.RegisterStatisticsByMonthView;

public interface RegisterStatisticsByMonthRepository extends JpaRepository<RegisterStatisticsByMonthView, Long> {

}
