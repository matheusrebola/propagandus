package propagandus.datalake.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.PeriodRegister;
import propagandus.datalake.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;
  public PeriodRegister save(PeriodRegister periodRegister){return periodRegisterRepository.save(periodRegister);}
}
