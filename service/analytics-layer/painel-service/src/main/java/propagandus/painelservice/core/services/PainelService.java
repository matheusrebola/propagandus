package propagandus.painelservice.core.services;

import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.dtos.PainelPerformanceDTO;
import propagandus.painelservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;

  List<PainelPerformanceDTO> painelPerformance(){
    return painelRepository.painelPerformance();
  }
}
