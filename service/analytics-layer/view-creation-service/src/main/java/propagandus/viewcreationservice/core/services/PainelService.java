package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.PainelPerformance;
import propagandus.viewcreationservice.core.dtos.PainelPerformanceDTO;
import propagandus.viewcreationservice.core.mappers.PainelPerformanceMapper;
import propagandus.viewcreationservice.core.repositorys.PainelRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.PainelPerformanceRepository;

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
