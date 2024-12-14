package propagandus.datalake.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.Attention;
import propagandus.datalake.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;
  public Attention save(Attention attention){return attentionRepository.save(attention);}
}
