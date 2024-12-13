package propagandus.periodregisterservice.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;
import propagandus.periodregisterservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;

  //repository
  public boolean existsById(Long id){return periodRegisterRepository.existsById(id);}

  //view
  public List<Object[]> countReactionsByPeriodOfTheDay(){return periodRegisterRepository.countReactionsByPeriodOfTheDay();}
  public List<Object[]> countReactionsByMonth(){return periodRegisterRepository.countReactionsByMonth();}
  public List<PeriodRegister> findByTimeRange(LocalDateTime startTime, LocalDateTime endTime){return periodRegisterRepository.findByTimeRange(startTime, endTime);}
  public List<Object[]> countRegistersByDayOfWeek(){return periodRegisterRepository.countRegistersByDayOfWeek();}
  public List<PeriodRegister> findByMonthAndYear(EMonth month, String year){return periodRegisterRepository.findByMonthAndYear(month, year);}
  public List<Object[]> countRegistersByPeriodOfTheDay(){return periodRegisterRepository.countRegistersByPeriodOfTheDay();}
  public List<Object[]> findPeakRegisterHour(){return periodRegisterRepository.findPeakRegisterHour();}
  public List<Object[]> countRegistersByDayWeekAndPeriod(){return periodRegisterRepository.countRegistersByDayWeekAndPeriod();}
  public List<PeriodRegister> findWeekdayRegisters(){return periodRegisterRepository.findWeekdayRegisters();}
  public Long countWeekendRegisters(){return periodRegisterRepository.countWeekendRegisters();}
  public List<Object[]> countRegistersByYearMonthDay(){return periodRegisterRepository.countRegistersByYearMonthDay();}
  public List<PeriodRegister> findByExactTime(Byte hour, Byte minute){return periodRegisterRepository.findByExactTime(hour, minute);}
  public List<PeriodRegister> findByMonthOrderedByTime(EMonth month){return periodRegisterRepository.findByMonthOrderedByTime(month);}
  public List<Object[]> countRegistersByPeriodAndMonth(){return periodRegisterRepository.countRegistersByPeriodAndMonth();}
  public List<Object[]> findDayWithMostRegistersInMonth(EMonth month){return periodRegisterRepository.findDayWithMostRegistersInMonth(month);}
  public List<Object[]> countRegistersBySpecificDays(List<Byte> days){return periodRegisterRepository.countRegistersBySpecificDays(days);}
}
