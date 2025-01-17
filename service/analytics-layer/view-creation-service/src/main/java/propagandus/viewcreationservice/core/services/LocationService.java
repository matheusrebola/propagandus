package propagandus.locationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.locationservice.core.documents.LocationPerformance;
import propagandus.locationservice.core.dtos.LocationPerformanceDTO;
import propagandus.locationservice.core.mappers.LocationPerformanceMapper;
import propagandus.locationservice.core.repositorys.LocationPerformanceRepository;
import propagandus.locationservice.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;
  private final LocationPerformanceMapper locationPerformanceMapper;
  private final LocationPerformanceRepository locationPerformanceRepository;
  
  List<LocationPerformance> locationPerformance(){
    List<LocationPerformanceDTO> dtoList = locationRepository.locationPerformance();
    List<LocationPerformance> locations = dtoList.stream()
      .map(locationPerformanceMapper::map)
      .toList();
    List<LocationPerformance> savedLocation = locationPerformanceRepository.saveAll(locations);
    return savedLocation;
  }
}
