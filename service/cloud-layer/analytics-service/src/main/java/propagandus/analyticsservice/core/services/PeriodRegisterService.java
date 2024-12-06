package propagandus.analyticsservice.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analyticsservice.core.models.PeriodRegister;
import propagandus.analyticsservice.core.models.enumerators.EDayWeek;
import propagandus.analyticsservice.core.models.enumerators.EMonth;
import propagandus.analyticsservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.analyticsservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;

  public List<PeriodRegister> findAll(){return periodRegisterRepository.findAll();}
  public PeriodRegister findById(Long id){return periodRegisterRepository.findById(id).orElse(null);}
  public PeriodRegister save(PeriodRegister periodRegister){return periodRegisterRepository.save(periodRegister);}
  public List<Byte> findByDay(Byte day){return periodRegisterRepository.findByDay(day);}
  public List<EDayWeek> findByDayWeek(EDayWeek dayWeek){return periodRegisterRepository.findByDayWeek(dayWeek);}
  public List<Byte> findByHour(Byte hour){return periodRegisterRepository.findByHour(hour);}
  public List<Byte> findByMinute(Byte minute){return periodRegisterRepository.findByMinute(minute);}
  public List<EPeriodOfTheDay> findByPeriodOfTheDay(EPeriodOfTheDay periodOfTheDay){return periodRegisterRepository.findByPeriodOfTheDay(periodOfTheDay);}
  public List<EMonth> findByMonth(EMonth month){return periodRegisterRepository.findByMonth(month);}
  public List<String> findByYear(String year){return periodRegisterRepository.findByYear(year);}
  public List<LocalDateTime> findByRegisterTime(LocalDateTime registerTime){return periodRegisterRepository.findByRegisterTime(registerTime);}
}
