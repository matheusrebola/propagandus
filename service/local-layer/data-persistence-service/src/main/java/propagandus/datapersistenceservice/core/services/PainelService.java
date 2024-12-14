package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.Painel;
import propagandus.datapersistenceservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;
  public Painel save(Painel painel){return painelRepository.save(painel);}
}
