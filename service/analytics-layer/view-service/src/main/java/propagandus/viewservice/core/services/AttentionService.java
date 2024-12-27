package propagandus.viewservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.AttentionByAudience;
import propagandus.viewservice.core.repositorys.AttentionByAudienceRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionByAudienceRepository attentionByAudienceRepository;

  public List<AttentionByAudience> attentionByAudience(){
    return attentionByAudienceRepository.findAll();
  }
}
