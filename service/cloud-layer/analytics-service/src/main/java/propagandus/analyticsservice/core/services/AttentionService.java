package propagandus.analyticsservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analyticsservice.core.models.Attention;
import propagandus.analyticsservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;

  public List<Attention> findAll(){return attentionRepository.findAll();}
  public Attention findById(Long id){return attentionRepository.findById(id).orElse(null);}
  public Attention save(Attention attention){return attentionRepository.save(attention);}
  public boolean exists(Long id){return attentionRepository.existsById(id);}
}
