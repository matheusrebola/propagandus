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

  public List<PeriodRegister> findByTimeRange(LocalDateTime startTime, LocalDateTime endTime){return null;}
  public List<PeriodRegister> findByMonthAndYear(EMonth month, String year){return null;}
  public List<PeriodRegister> findByExactTime(Byte hour, Byte minute){return null;}
  public List<PeriodRegister> findByMonthOrderedByTime(EMonth month){return null;}
  public List<Object[]> findDayWithMostRegistersInMonth(EMonth month){return null;}
  public List<Object[]> countRegistersBySpecificDays(List<Byte> days){return null;}
}
