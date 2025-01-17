package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.LocationPerformance;
import propagandus.viewcreationservice.core.dtos.LocationPerformanceDTO;

@Component
@RequiredArgsConstructor
public class LocationPerformanceMapper {
  private final ModelMapper modelMapper;

  public LocationPerformance map(LocationPerformanceDTO dto){
    LocationPerformance location = modelMapper.map(dto, LocationPerformance.class);
    return location;
  }
}
