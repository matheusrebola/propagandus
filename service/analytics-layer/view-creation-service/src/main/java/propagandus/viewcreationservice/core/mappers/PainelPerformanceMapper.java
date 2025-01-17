package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.PainelPerformance;
import propagandus.viewcreationservice.core.dtos.PainelPerformanceDTO;

@Component
@RequiredArgsConstructor
public class PainelPerformanceMapper {
  private final ModelMapper modelMapper;

  public PainelPerformance map(PainelPerformanceDTO dto){
    PainelPerformance painel = modelMapper.map(dto, PainelPerformance.class);
    return painel;
  }
}
