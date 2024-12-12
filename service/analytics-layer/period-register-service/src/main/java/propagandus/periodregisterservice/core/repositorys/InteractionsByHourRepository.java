package propagandus.periodregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.periodregisterservice.core.views.InteractionsByHourView;

public interface InteractionsByHourRepository extends JpaRepository<InteractionsByHourView, Long> {

}
