package propagandus.analiticsservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analiticsservice.core.models.Painel;
import propagandus.analiticsservice.core.models.enumerators.EStatus;
import propagandus.analiticsservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;

  public List<Painel> findAll(){return painelRepository.findAll();}
  public Painel findById(Long id){return painelRepository.findById(id).orElse(null);}
  public Painel save(Painel painel){return painelRepository.save(painel);}
  public String findByIdentification(String identification){return painelRepository.findByIdentification(identification);}
  public EStatus findByStatus(EStatus status){return painelRepository.findByStatus(status);}
  public List<String> findByModel(String model){return painelRepository.findByModel(model);}
}
