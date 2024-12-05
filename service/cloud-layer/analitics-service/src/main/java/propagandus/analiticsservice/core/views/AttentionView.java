package propagandus.analiticsservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.analiticsservice.core.models.Painel;
import propagandus.analiticsservice.core.models.enumerators.EMonth;
import propagandus.analiticsservice.core.models.enumerators.EPeriodOfTheDay;

public interface AttentionView {
  //Obter painéis com maior número de atenção registrada em um período específico
  @Query("SELECT a.painel, SUM(a.lookCount) AS totalLooks FROM attention a JOIN a.painel p WHERE p.location.city = :city AND a.painel.status = 'ACTIVE' GROUP BY a.painel ORDER BY totalLooks DESC")
  List<Object[]> findPainelsWithHighestAttentionByCity(@Param("city") String city);

  //Buscar painéis que têm mais de X interações de atenção
  @Query("SELECT a.painel FROM attention a GROUP BY a.painel HAVING SUM(a.peopleCount) > :threshold")
  List<Painel> findPainelsWithAttentionAboveThreshold(@Param("threshold") Short threshold);

  //Buscar os períodos de maior atenção para um painel específico
  @Query("SELECT p.periodOfTheDay, SUM(a.attentionLevel) AS totalAttention FROM attention a JOIN period_register p ON a.painel.id = p.id WHERE a.painel.id = :painelId GROUP BY p.periodOfTheDay ORDER BY totalAttention DESC")
  List<Object[]> findPeakAttentionPeriodsByPainel(@Param("painelId") Long painelId);

  //Obter painéis com maior atenção em um mês específico
  @Query("SELECT a.painel, SUM(a.attentionLevel) AS totalAttention FROM attention a JOIN period_register p ON a.painel.id = p.id WHERE p.month = :month GROUP BY a.painel ORDER BY totalAttention DESC")
  List<Object[]> findPainelsWithHighestAttentionByMonth(@Param("month") EMonth month);

  //Obter a média de atenção por painel em uma localização específica
  @Query("SELECT a.painel, AVG(a.attentionLevel) AS avgAttention FROM attention a JOIN a.painel p WHERE p.location.city = :city GROUP BY a.painel")
  List<Object[]> findAverageAttentionByPainelInCity(@Param("city") String city);

  //Buscar painéis com maior número de pessoas interagindo em um período específico
  @Query("SELECT a.painel, MAX(a.peopleCount) AS maxPeople FROM attention a JOIN period_register p ON a.painel.id = p.id WHERE p.periodOfTheDay = :period GROUP BY a.painel ORDER BY maxPeople DESC")
  List<Object[]> findPainelsWithMostPeopleInPeriod(@Param("period") EPeriodOfTheDay period);
}
