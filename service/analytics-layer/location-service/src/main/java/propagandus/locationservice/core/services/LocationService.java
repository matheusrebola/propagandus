package propagandus.locationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.locationservice.core.dtos.LocationPerformanceDTO;
import propagandus.locationservice.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;
  
  List<LocationPerformanceDTO> locationPerformance(){
    return locationRepository.locationPerformance();
  }
}
