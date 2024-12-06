package propagandus.analiticsservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analiticsservice.core.models.Attention;
import propagandus.analiticsservice.core.models.enumerators.EAttentionLevel;
import propagandus.analiticsservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;

  public List<Attention> findAll(){return attentionRepository.findAll();}
  public Attention findById(Long id){return attentionRepository.findById(id).orElse(null);}
  public Attention save(Attention attention){return attentionRepository.save(attention);}
  public List<EAttentionLevel> findByAttention(EAttentionLevel attention){return attentionRepository.findByAttention(attention);}
  public List<Byte> findByAttentionLevel(Byte attention){return findByAttentionLevel(attention);}
  public List<Short> findByLookCount(Short lookCount){return findByLookCount(lookCount);}
  public List<Short> findByPeopleCount(Short peopleCount){return findByPeopleCount(peopleCount);}
}
