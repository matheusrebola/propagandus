package propagandus.datareciverservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datareciverservice.core.documents.Attention;
import propagandus.datareciverservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;
  public Attention insert(Attention attention){return attentionRepository.insert(attention);}
  public List<Attention> findAll(){return attentionRepository.findAll();}
}
