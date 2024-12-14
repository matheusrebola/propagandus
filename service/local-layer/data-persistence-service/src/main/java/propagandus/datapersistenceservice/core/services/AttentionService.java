package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.Attention;
import propagandus.datapersistenceservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;
  public Attention save(Attention attention){return attentionRepository.save(attention);}
}
