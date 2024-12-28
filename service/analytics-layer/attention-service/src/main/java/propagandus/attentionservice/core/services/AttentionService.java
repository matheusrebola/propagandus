package propagandus.attentionservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.documents.AttentionByAudience;
import propagandus.attentionservice.core.dtos.AttentionByAudienceDTO;
import propagandus.attentionservice.core.mappers.AttentionByAudienceMapper;
import propagandus.attentionservice.core.repositorys.AttentionByAudienceRepository;
import propagandus.attentionservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;
  private final AttentionByAudienceMapper attentionByAudienceMapper;
  private final AttentionByAudienceRepository attentionByAudienceRepository;

  public List<AttentionByAudience> attentionByAudience(){
    List<AttentionByAudienceDTO> dtoList = attentionRepository.attentionByAudience();
    List<AttentionByAudience> attentions = dtoList.stream()
      .map(attentionByAudienceMapper::map)
      .toList();
    List<AttentionByAudience> savedAttention = attentionByAudienceRepository.saveAll(attentions);
    return savedAttention;
  }
}
