package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.LocationPainelSummary;
import propagandus.viewcreationservice.core.dtos.LocationPainelSummaryDTO;

@Component
@RequiredArgsConstructor
public class LocationPainelSummaryMapper {
	private final ModelMapper mapper;
	
	public LocationPainelSummary map(LocationPainelSummaryDTO dto) {
		LocationPainelSummary location = mapper.map(dto, LocationPainelSummary.class);
		return location;
	}
}
