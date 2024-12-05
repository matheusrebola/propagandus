package propagandus.analiticsservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface PeriodRegisterView {
  //Contar o número de reações por período do dia
  @Query("SELECT p.periodOfTheDay, COUNT(r) FROM period_register p JOIN reaction r ON p.id = r.id GROUP BY p.periodOfTheDay")
  List<Object[]> countReactionsByPeriodOfTheDay();

  //Contar o número de reações por mês
  @Query("SELECT p.month, COUNT(r) FROM period_register p JOIN reaction r ON p.id = r.id GROUP BY p.month ORDER BY p.month")
  List<Object[]> countReactionsByMonth();
}
