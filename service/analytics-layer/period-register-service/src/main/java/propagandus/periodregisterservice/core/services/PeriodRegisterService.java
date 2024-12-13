package propagandus.periodregisterservice.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
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
import propagandus.periodregisterservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;

  //repository
  public boolean existsById(Long id){return periodRegisterRepository.existsById(id);}

  //view
  public List<ReactionCountByPeriodDTO> countReactionsByPeriodOfTheDay(){return periodRegisterRepository.countReactionsByPeriodOfTheDay();}
  public List<ReactionCountByMonthDTO> countReactionsByMonth(){return periodRegisterRepository.countReactionsByMonth();}
  public List<PeriodRegisterDTO> findByTimeRange(LocalDateTime startTime, LocalDateTime endTime){return periodRegisterRepository.findByTimeRange(startTime, endTime);}
  public List<RegisterCountByDayWeekDTO> countRegistersByDayOfWeek(){return periodRegisterRepository.countRegistersByDayOfWeek();}
  public List<PeriodRegisterDTO> findByMonthAndYear(EMonth month, String year){return periodRegisterRepository.findByMonthAndYear(month, year);}
  public List<RegisterCountByPeriodDTO> countRegistersByPeriodOfTheDay(){return periodRegisterRepository.countRegistersByPeriodOfTheDay();}
  public List<PeakRegisterHourDTO> findPeakRegisterHour(){return periodRegisterRepository.findPeakRegisterHour();}
  public List<RegisterCountByDayWeekAndPeriodDTO> countRegistersByDayWeekAndPeriod(){return periodRegisterRepository.countRegistersByDayWeekAndPeriod();}
  public List<PeriodRegisterDTO> findWeekdayRegisters(){return periodRegisterRepository.findWeekdayRegisters();}
  public Integer countWeekendRegisters(){return periodRegisterRepository.countWeekendRegisters();}
  public List<RegisterCountByDateDTO> countRegistersByYearMonthDay(){return periodRegisterRepository.countRegistersByYearMonthDay();}
  public List<PeriodRegisterDTO> findByExactTime(Byte hour, Byte minute){return periodRegisterRepository.findByExactTime(hour, minute);}
  public List<PeriodRegisterDTO> findByMonthOrderedByTime(EMonth month){return periodRegisterRepository.findByMonthOrderedByTime(month);}
  public List<RegisterCountByPeriodAndMonthDTO> countRegistersByPeriodAndMonth(){return periodRegisterRepository.countRegistersByPeriodAndMonth();}
  public List<DayWithMostRegistersDTO> findDayWithMostRegistersInMonth(EMonth month){return periodRegisterRepository.findDayWithMostRegistersInMonth(month);}
  public List<RegisterCountByDayDTO> countRegistersBySpecificDays(List<Byte> days){return periodRegisterRepository.countRegistersBySpecificDays(days);}
  public List<PeriodRegisterDTO> findMostRecentRegisters(Pageable pageable){return periodRegisterRepository.findMostRecentRegisters(pageable);}
}
