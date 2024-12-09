package propagandus.datapersistenceservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.PeriodRegister;
import propagandus.datapersistenceservice.core.repositorys.PeriodRegisterRepository;

@Service
@RequiredArgsConstructor
public class PeriodRegisterService {
  private final PeriodRegisterRepository periodRegisterRepository;

  public List<PeriodRegister> findAll(){return periodRegisterRepository.findAll();}
  public PeriodRegister findById(Long id){return periodRegisterRepository.findById(id).orElse(null);}
  public PeriodRegister save(PeriodRegister periodRegister){return periodRegisterRepository.save(periodRegister);}
  public boolean existsById(Long id){return periodRegisterRepository.existsById(id);}
}
