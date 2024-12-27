package propagandus.viewservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.PainelPerformance;
import propagandus.viewservice.core.repositorys.PainelPerformanceRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelPerformanceRepository painelPerformanceRepository;
  
  public List<PainelPerformance> painelPerformance(){
    return painelPerformanceRepository.findAll();
  }
}
