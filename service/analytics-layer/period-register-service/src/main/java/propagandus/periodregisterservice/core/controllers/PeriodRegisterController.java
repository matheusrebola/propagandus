package propagandus.periodregisterservice.core.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.periodregisterservice.core.dtos.PeakRegisterHourDTO;
import propagandus.periodregisterservice.core.dtos.PeriodRegisterDTO;
import propagandus.periodregisterservice.core.dtos.ReactionCountByMonthDTO;
import propagandus.periodregisterservice.core.dtos.ReactionCountByPeriodDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDateDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDayWeekAndPeriodDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByDayWeekDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByPeriodAndMonthDTO;
import propagandus.periodregisterservice.core.dtos.RegisterCountByPeriodDTO;
import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

@RestController
@RequestMapping("/period-register")
@RequiredArgsConstructor
public class PeriodRegisterController {

  @GetMapping("/reactions-by-period-of-day")
  public List<ReactionCountByPeriodDTO> countReactionsByPeriodOfTheDay(){return null;}

  @GetMapping("/reactions-by-month")
  public List<ReactionCountByMonthDTO> countReactionsByMonth(){return null;}

  @GetMapping("/by-day-of-week")
  public List<RegisterCountByDayWeekDTO> countRegistersByDayOfWeek(){return null;}

  @GetMapping("/register-by-period-of-day")
  public List<RegisterCountByPeriodDTO> countRegistersByPeriodOfTheDay(){return null;}

  @GetMapping("/peak-register-hour")
  public List<PeakRegisterHourDTO> findPeakRegisterHour(){return null;}
  
  @GetMapping("/register-by-day-week-and-period")
  public List<RegisterCountByDayWeekAndPeriodDTO> countRegistersByDayWeekAndPeriod(){return null;}

  @GetMapping("/week-day-registers")
  public List<PeriodRegisterDTO> findWeekdayRegisters(){return null;}

  @GetMapping("/weekend-registers")
  public Integer countWeekendRegisters(){return null;}

  @GetMapping("/registers-by-year-month-day")
  public List<RegisterCountByDateDTO> countRegistersByYearMonthDay(){return null;}

  @GetMapping("/register-by-period-and-month")
  public List<RegisterCountByPeriodAndMonthDTO> countRegistersByPeriodAndMonth(){return null;}

  @GetMapping("/start/{start-time}/end/{end-time}")
  public List<PeriodRegister> findByTimeRange(@PathVariable LocalDateTime startTime, @PathVariable LocalDateTime endTime){return null;}

  @GetMapping("/month/{month}/year/{year}")
  public List<PeriodRegister> findByMonthAndYear(@PathVariable EMonth month, @PathVariable String year){return null;}

  @GetMapping("/hour/{hour}/minute/{minute}")
  public List<PeriodRegister> findByExactTime(@PathVariable Byte hour, @PathVariable Byte minute){return null;}

  @GetMapping("/period/{month}")
  public List<PeriodRegister> findByMonthOrderedByTime(@PathVariable EMonth month){return null;}

  @GetMapping("{month}")
  public List<Object[]> findDayWithMostRegistersInMonth(@PathVariable EMonth month){return null;}

  @GetMapping("{days}")
  public List<Object[]> countRegistersBySpecificDays(@PathVariable List<Byte> days){return null;}
}
