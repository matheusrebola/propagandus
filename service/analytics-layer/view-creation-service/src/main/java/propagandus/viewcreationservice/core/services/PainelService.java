package propagandus.painelservice.core.services;

import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.documents.PainelPerformance;
import propagandus.painelservice.core.dtos.PainelPerformanceDTO;
import propagandus.painelservice.core.mappers.PainelPerformanceMapper;
import propagandus.painelservice.core.repositorys.PainelPerformanceRepository;
import propagandus.painelservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;
  private final PainelPerformanceMapper painelPerformanceMapper;
  private final PainelPerformanceRepository painelPerformanceRepository;
  
  List<PainelPerformance> locationPerformance(){
    List<PainelPerformanceDTO> dtoList = painelRepository.painelPerformance();
    List<PainelPerformance> painels = dtoList.stream()
      .map(painelPerformanceMapper::map)
      .toList();
    List<PainelPerformance> savedLocation = painelPerformanceRepository.saveAll(painels);
    return savedLocation;
  }
}
