package propagandus.periodregisterservice.core.repositorys;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.models.enumerators.EDayWeek;
import propagandus.periodregisterservice.core.models.enumerators.EMonth;
import propagandus.periodregisterservice.core.models.enumerators.EPeriodOfTheDay;

@Repository
public interface PeriodRegisterRepository extends JpaRepository<PeriodRegister, Long> {
  List<Byte> findByDay(Byte day);
  List<EDayWeek> findByDayWeek(EDayWeek dayWeek);
  List<Byte> findByHour(Byte hour);
  List<Byte> findByMinute(Byte minute);
  List<EPeriodOfTheDay> findByPeriodOfTheDay(EPeriodOfTheDay periodOfTheDay);
  List<EMonth> findByMonth(EMonth month);
  List<String> findByYear(String year);
  List<LocalDateTime> findByRegisterTime(LocalDateTime registerTime);
}