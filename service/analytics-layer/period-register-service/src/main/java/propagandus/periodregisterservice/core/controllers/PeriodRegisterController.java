package propagandus.periodregisterservice.core.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

@RestController
@RequestMapping("/period-register")
@RequiredArgsConstructor
public class PeriodRegisterController {

  public List<PeriodRegister> findAll(){return null;}
  public PeriodRegister findById(Long id){return null;}
  public boolean existsById(Long id){return false;}
  public List<Object[]> countReactionsByPeriodOfTheDay(){return null;}
  public List<Object[]> countReactionsByMonth(){return null;}
  public List<PeriodRegister> findByTimeRange(LocalDateTime startTime, LocalDateTime endTime){return null;}
  public List<Object[]> countRegistersByDayOfWeek(){return null;}
  public List<PeriodRegister> findByMonthAndYear(EMonth month, String year){return null;}
  public List<Object[]> countRegistersByPeriodOfTheDay(){return null;}
  public List<Object[]> findPeakRegisterHour(){return null;}
  public List<Object[]> countRegistersByDayWeekAndPeriod(){return null;}
  public List<PeriodRegister> findWeekdayRegisters(){return null;}
  public Long countWeekendRegisters(){return null;}
  public List<Object[]> countRegistersByYearMonthDay(){return null;}
  public List<PeriodRegister> findByExactTime(Byte hour, Byte minute){return null;}
  public List<PeriodRegister> findByMonthOrderedByTime(EMonth month){return null;}
  public List<Object[]> countRegistersByPeriodAndMonth(){return null;}
  public List<Object[]> findDayWithMostRegistersInMonth(EMonth month){return null;}
  public List<Object[]> countRegistersBySpecificDays(List<Byte> days){return null;}
}
