package propagandus.backupservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.backupservice.core.models.Attention;
import propagandus.backupservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;

  public List<Attention> findAll(){return attentionRepository.findAll();}
  public Attention findById(Long id){return attentionRepository.findById(id).orElse(null);}
  public Attention save(Attention attention){return attentionRepository.save(attention);}
}
