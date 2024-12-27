package propagandus.staticregisterservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.staticregisterservice.core.models.Painel;
import propagandus.staticregisterservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;
  public Painel save(Painel painel){return painelRepository.save(painel);}
}
