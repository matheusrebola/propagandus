package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.AttentionByAudience;
import propagandus.viewcreationservice.core.dtos.AttentionByAudienceDTO;
import propagandus.viewcreationservice.core.mappers.AttentionByAudienceMapper;
import propagandus.viewcreationservice.core.repositorys.AttentionRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.AttentionByAudienceRepository;

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
