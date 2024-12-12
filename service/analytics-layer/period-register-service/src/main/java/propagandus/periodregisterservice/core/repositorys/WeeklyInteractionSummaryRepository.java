package propagandus.periodregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.periodregisterservice.core.views.WeeklyInteractionSummaryView;

public interface WeeklyInteractionSummaryRepository extends JpaRepository<WeeklyInteractionSummaryView, Long> {

}
