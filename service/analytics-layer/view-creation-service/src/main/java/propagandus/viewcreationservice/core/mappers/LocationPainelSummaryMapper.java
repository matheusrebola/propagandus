package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.LocationPainelSummary;
import propagandus.viewcreationservice.core.dtos.LocationPainelSummaryDTO;

@Component
public class LocationPainelSummaryMapper {
	@Autowired
	private final ModelMapper mapper;
	
	public LocationPainelSummary map(LocationPainelSummaryDTO dto) {
		LocationPainelSummary location = mapper.map(dto, LocationPainelSummary.class);
		return location;
	}
	
	public LocationPainelSummaryDTO map(LocationPainelSummary location) {
		LocationPainelSummaryDTO dto = mapper.map(location, LocationPainelSummaryDTO.class);
		return dto;
	}
}
