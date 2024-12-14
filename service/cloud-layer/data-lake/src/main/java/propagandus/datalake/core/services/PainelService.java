package propagandus.datalake.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.Painel;
import propagandus.datalake.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;
  public Painel save(Painel painel){return painelRepository.save(painel);}
}
