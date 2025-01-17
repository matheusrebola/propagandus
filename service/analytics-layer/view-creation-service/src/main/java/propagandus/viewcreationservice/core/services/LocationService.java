package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.LocationPerformance;
import propagandus.viewcreationservice.core.dtos.LocationPerformanceDTO;
import propagandus.viewcreationservice.core.mappers.LocationPerformanceMapper;
import propagandus.viewcreationservice.core.repositorys.LocationRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.LocationPerformanceRepository;

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
