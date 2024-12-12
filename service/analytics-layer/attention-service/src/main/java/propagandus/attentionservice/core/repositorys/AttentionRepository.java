package propagandus.attentionservice.core.repositorys;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import propagandus.attentionservice.core.models.Attention;
import propagandus.attentionservice.core.models.Painel;
import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

@Repository
public interface AttentionRepository extends JpaRepository<Attention, Long> {
  List<EAttentionLevel> findByAttention(EAttentionLevel attention);
  List<Byte> findByAttentionLevel(Byte attention);
  List<Short> findByLookCount(Short lookCount);
  List<Short> findByPeopleCount(Short peopleCount);

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

  //Buscar os níveis de atenção média por cidade
  @Query("SELECT p.location.city, AVG(a.attentionLevel) AS avgAttention FROM attention a JOIN a.painel p GROUP BY p.location.city ORDER BY avgAttention DESC")
  List<Object[]> findAverageAttentionByCity();

  //Obter os painéis com maior número de olhares registrados
  @Query("SELECT a.painel, SUM(a.lookCount) AS totalLooks FROM attention a GROUP BY a.painel ORDER BY totalLooks DESC")
  List<Object[]> findPainelsWithMostLooks();

  //Listar os níveis de atenção mais altos por modelo de painel
  @Query("SELECT p.model, MAX(a.attentionLevel) AS maxAttention FROM attention a JOIN a.painel p GROUP BY p.model ORDER BY maxAttention DESC")
  List<Object[]> findHighestAttentionByPainelModel();

  //Obter o número total de olhares em um painel específico durante uma semana
  @Query("SELECT SUM(a.lookCount) FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE a.painel.id = :painelId AND pr.dayWeek IN ('MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN')")
  Long findTotalLooksForPainelInWeek(@Param("painelId") Long painelId);

  //Listar painéis com maior quantidade de pessoas registradas em interações durante a noite
  @Query("SELECT a.painel, SUM(a.peopleCount) AS totalPeople FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE pr.periodOfTheDay = 'NIGHT' GROUP BY a.painel ORDER BY totalPeople DESC")
  List<Object[]> findPainelsWithMostPeopleAtNight();

  //Buscar os níveis de atenção mais altos por estado
  @Query("SELECT p.location.state, MAX(a.attentionLevel) AS maxAttention FROM attention a JOIN a.painel p GROUP BY p.location.state ORDER BY maxAttention DESC")
  List<Object[]> findHighestAttentionByState();

  //Obter o número de interações por painel durante um mês específico
  @Query("SELECT a.painel, COUNT(a) AS interactionCount FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE pr.month = :month GROUP BY a.painel ORDER BY interactionCount DESC")
  List<Object[]> findInteractionCountByPainelAndMonth(@Param("month") EMonth month);

  //Calcular a média de pessoas registradas por painel em uma cidade específica
  @Query("SELECT p.location.city, AVG(a.peopleCount) AS avgPeople FROM attention a JOIN a.painel p WHERE p.location.city = :city GROUP BY p.location.city")
  List<Object[]> findAveragePeopleCountByCity(@Param("city") String city);

  //Obter painéis com maior número de interações de atenção durante um horário específico
  @Query("SELECT a.painel, COUNT(a) AS interactionCount FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE pr.hour = :hour GROUP BY a.painel ORDER BY interactionCount DESC")
  List<Object[]> findPainelsWithMostInteractionsAtHour(@Param("hour") Byte hour);

  //Contar o número de olhares registrados por cidade e período do dia
  @Query("SELECT p.location.city, pr.periodOfTheDay, SUM(a.lookCount) AS totalLooks FROM attention a JOIN a.painel p JOIN period_register pr ON a.painel.id = pr.id GROUP BY p.location.city, pr.periodOfTheDay ORDER BY totalLooks DESC")
  List<Object[]> countLooksByCityAndPeriod();

  //Listar os painéis mais visualizados em uma data específica
  @Query("SELECT a.painel, SUM(a.lookCount) AS totalLooks FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE pr.registerTime = :date GROUP BY a.painel ORDER BY totalLooks DESC")
  List<Object[]> findMostViewedPainelsByDate(@Param("date") LocalDateTime date);

  //Obter o painel com maior nível de atenção em um estado específico
  @Query("SELECT p, MAX(a.attentionLevel) FROM attention a JOIN a.painel p WHERE p.location.state = :state GROUP BY p")
  List<Object[]> findHighestAttentionLevelByPainelInState(@Param("state") String state);

  //Calcular a média de olhares registrados por painel durante um horário específico
  @Query("SELECT a.painel, AVG(a.lookCount) AS avgLooks FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE pr.hour = :hour GROUP BY a.painel ORDER BY avgLooks DESC")
  List<Object[]> findAverageLooksByPainelAtHour(@Param("hour") Byte hour);

  //Buscar os painéis com maior quantidade de interações em um dia da semana específico
  @Query("SELECT a.painel, COUNT(a) AS interactionCount FROM attention a JOIN period_register pr ON a.painel.id = pr.id WHERE pr.dayWeek = :dayWeek GROUP BY a.painel ORDER BY interactionCount DESC")
  List<Object[]> findPainelsWithMostInteractionsByDayOfWeek(@Param("dayWeek") EDayWeek dayWeek);
}

