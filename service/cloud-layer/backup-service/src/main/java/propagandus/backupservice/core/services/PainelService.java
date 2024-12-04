package propagandus.backupservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.backupservice.core.models.Painel;
import propagandus.backupservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;

  public List<Painel> findAll(){return painelRepository.findAll();}
  public Painel findById(Long id){return painelRepository.findById(id).orElse(null);}
  public Painel save(Painel painel){return painelRepository.save(painel);}
}
