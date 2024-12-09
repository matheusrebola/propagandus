package propagandus.periodregisterservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.periodregisterservice.core.models.PeriodRegister;
import propagandus.periodregisterservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;

  public List<PeriodRegister> findAll(){return periodRegisterRepository.findAll();}
  public PeriodRegister findById(Long id){return periodRegisterRepository.findById(id).orElse(null);}
  public PeriodRegister save(PeriodRegister periodRegister){return periodRegisterRepository.save(periodRegister);}
}
