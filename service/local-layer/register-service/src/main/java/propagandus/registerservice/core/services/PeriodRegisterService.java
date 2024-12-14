package propagandus.registerservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.PeriodRegister;
import propagandus.registerservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;
  public PeriodRegister insert(PeriodRegister periodRegister){return periodRegisterRepository.insert(periodRegister);}
}
