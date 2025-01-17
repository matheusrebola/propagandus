package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.PainelPerformance;
import propagandus.viewcreationservice.core.dtos.PainelPerformanceDTO;

@Component
public class PainelPerformanceMapper {
	@Autowired
	private final ModelMapper mapper;

	public PainelPerformance map(PainelPerformanceDTO dto) {
		PainelPerformance painel = mapper.map(dto, PainelPerformance.class);
		return painel;
	}
	
	public PainelPerformanceDTO map(PainelPerformance painel) {
		PainelPerformanceDTO dto = mapper.map(painel, PainelPerformanceDTO.class);
		return dto;
	}
}
