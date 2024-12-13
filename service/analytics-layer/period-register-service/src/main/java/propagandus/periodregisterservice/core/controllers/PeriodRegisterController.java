package propagandus.periodregisterservice.core.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;

@RestController
@RequestMapping("/period-register")
@RequiredArgsConstructor
public class PeriodRegisterController {

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
