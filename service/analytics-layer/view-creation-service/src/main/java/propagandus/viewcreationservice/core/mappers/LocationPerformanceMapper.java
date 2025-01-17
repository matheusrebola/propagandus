package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.LocationPerformance;
import propagandus.viewcreationservice.core.dtos.LocationPerformanceDTO;

@Component
public class LocationPerformanceMapper {
	@Autowired
	private final ModelMapper mapper;

	public LocationPerformance map(LocationPerformanceDTO dto) {
		LocationPerformance location = mapper.map(dto, LocationPerformance.class);
		return location;
	}
	
	public LocationPerformanceDTO map(LocationPerformance location) {
		LocationPerformanceDTO dto = mapper.map(location, LocationPerformanceDTO.class);
		return dto;
	}
}
