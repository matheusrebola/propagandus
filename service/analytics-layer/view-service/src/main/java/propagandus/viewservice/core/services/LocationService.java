package propagandus.viewservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.LocationPerformance;
import propagandus.viewservice.core.repositorys.LocationPerformanceRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationPerformanceRepository locationPerformanceRepository;

  public List<LocationPerformance> locationPerformance(){
    return locationPerformanceRepository.findAll();
  }
}
