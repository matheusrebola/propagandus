package propagandus.periodregisterservice.core.views;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.periodregisterservice.core.dtos.DayWithMostRegistersDTO;
import propagandus.periodregisterservice.core.dtos.PeakRegisterHourDTO;
import propagandus.periodregisterservice.core.dtos.PeriodRegisterDTO;
import propagandus.periodregisterservice.core.dtos.ReactionCountByMonthDTO;
import propagandus.periodregisterservice.core.dtos.ReactionCountByPeriodDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDateDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDayDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDayWeekAndPeriodDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDayWeekDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByPeriodAndMonthDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByPeriodDTO;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public interface PeriodRegisterView {
  /*
  
  //Contar o número de reações por período do dia
  @Query("SELECT p.periodOfTheDay, COUNT(r) FROM period_register p JOIN reaction r ON p.id = r.id GROUP BY p.periodOfTheDay")
  List<ReactionCountByPeriodDTO> countReactionsByPeriodOfTheDay();
  
  //Contar o número de reações por mês
  @Query("SELECT p.month, COUNT(r) FROM period_register p JOIN reaction r ON p.id = r.id GROUP BY p.month ORDER BY p.month")
  List<ReactionCountByMonthDTO> countReactionsByMonth();
  
  //Buscar registros em um período de tempo específico
  @Query("SELECT pr FROM period_register pr WHERE pr.registerTime BETWEEN :startTime AND :endTime")
  List<PeriodRegisterDTO> findByTimeRange(@Param("startTime") LocalDateTime startTime, @Param("endTime") LocalDateTime endTime);
  
  //Contar registros por dia da semana
  @Query("SELECT pr.dayWeek, COUNT(pr) AS registerCount FROM period_register pr GROUP BY pr.dayWeek ORDER BY registerCount DESC")
  List<RegisterCountByDayWeekDTO> countRegistersByDayOfWeek();
  
  //Buscar registros em um determinado mês e ano
  @Query("SELECT pr FROM period_register pr WHERE pr.month = :month AND pr.year = :year")
  List<PeriodRegisterDTO> findByMonthAndYear(@Param("month") EMonth month, @Param("year") String year);
  
  //Listar registros por período do dia
  @Query("SELECT pr.periodOfTheDay, COUNT(pr) AS registerCount FROM period_register pr GROUP BY pr.periodOfTheDay ORDER BY registerCount DESC")
  List<RegisterCountByPeriodDTO> countRegistersByPeriodOfTheDay();
  
  //Obter o horário com mais registros
  @Query("SELECT pr.hour, COUNT(pr) AS registerCount FROM period_register pr GROUP BY pr.hour ORDER BY registerCount DESC")
  List<PeakRegisterHourDTO> findPeakRegisterHour();
  
  //Contar registros por combinação de dia da semana e período do dia
  @Query("SELECT pr.dayWeek, pr.periodOfTheDay, COUNT(pr) AS registerCount FROM period_register pr GROUP BY pr.dayWeek, pr.periodOfTheDay ORDER BY registerCount DESC")
  List<RegisterCountByDayWeekAndPeriodDTO> countRegistersByDayWeekAndPeriod();
  
  //Buscar registros realizados em dias úteis
  @Query("SELECT pr FROM period_register pr WHERE pr.dayWeek IN ('MON', 'TUE', 'WED', 'THU', 'FRI')")
  List<PeriodRegisterDTO> findWeekdayRegisters();
  
  //Contar registros realizados aos finais de semana
  @Query("SELECT COUNT(pr) FROM period_register pr WHERE pr.dayWeek IN ('SAT', 'SUN')")
  Integer countWeekendRegisters();
  
  //Listar registros por ano, mês e dia
  @Query("SELECT pr.year, pr.month, pr.day, COUNT(pr) AS registerCount FROM period_register pr GROUP BY pr.year, pr.month, pr.day ORDER BY pr.year, pr.month, pr.day")
  List<RegisterCountByDateDTO> countRegistersByYearMonthDay();
  
  //Buscar registros em um horário exato
  @Query("SELECT pr FROM period_register pr WHERE pr.hour = :hour AND pr.minute = :minute")
  List<PeriodRegisterDTO> findByExactTime(@Param("hour") Byte hour, @Param("minute") Byte minute);
  
  //Obter registros em um mês específico ordenados por horário
  @Query("SELECT pr FROM period_register pr WHERE pr.month = :month ORDER BY pr.registerTime ASC")
  List<PeriodRegisterDTO> findByMonthOrderedByTime(@Param("month") EMonth month);
  
  //Calcular o total de registros por período do dia e mês
  @Query("SELECT pr.periodOfTheDay, pr.month, COUNT(pr) AS registerCount FROM period_register pr GROUP BY pr.periodOfTheDay, pr.month ORDER BY registerCount DESC")
  List<RegisterCountByPeriodAndMonthDTO> countRegistersByPeriodAndMonth();
  
  //Buscar o dia com mais registros em um mês específico
  @Query("SELECT pr.day, COUNT(pr) AS registerCount FROM period_register pr WHERE pr.month = :month GROUP BY pr.day ORDER BY registerCount DESC")
  List<DayWithMostRegistersDTO> findDayWithMostRegistersInMonth(@Param("month") EMonth month);
  
  //Contar registros realizados em dias específicos do mês
  @Query("SELECT pr.day, COUNT(pr) AS registerCount FROM period_register pr WHERE pr.day IN (:days) GROUP BY pr.day ORDER BY pr.day ASC")
  List<RegisterCountByDayDTO> countRegistersBySpecificDays(@Param("days") List<Byte> days);
  
  //Obter os registros mais recentes
  @Query("SELECT pr FROM period_register pr ORDER BY pr.registerTime DESC")
  List<PeriodRegisterDTO> findMostRecentRegisters(Pageable pageable);
  
  /*@Query("""
    SELECT 
    pr.hour,
    COUNT(r.reaction_id) AS total_interactions
    FROM reaction_table r
    LEFT JOIN date_time_table pr ON pr.period_register_id = r.period_time_id
    GROUP BY pr.hour
    """) */
   /*@Query("""
    SELECT 
    pr.month,
    COUNT(pr.period_register_id) AS total_registers
    FROM date_time_table pr
    GROUP BY pr.month
    """) */
   /*@Query("""
    SELECT 
    pr.day_week,
    COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN date_time_table pr ON pr.period_register_id = r.period_time_id
    GROUP BY pr.day_week
    """) */
  
  }
  