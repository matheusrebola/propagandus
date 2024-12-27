package propagandus.attentionservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.dtos.AttentionByAudienceDTO;
import propagandus.attentionservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;

  public List<AttentionByAudienceDTO> attentionByAudience(){
    return attentionRepository.attentionByAudience();
  }
}
