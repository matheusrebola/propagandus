package propagandus.periodregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.periodregisterservice.core.views.ActivityByDayView;

public interface ActivityByDayRepository extends JpaRepository<ActivityByDayView, Long> {

}
