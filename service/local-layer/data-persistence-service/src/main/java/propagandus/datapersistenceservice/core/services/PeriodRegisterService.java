package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.PeriodRegister;
import propagandus.datapersistenceservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;
  public PeriodRegister save(PeriodRegister periodRegister){return periodRegisterRepository.save(periodRegister);}
}
