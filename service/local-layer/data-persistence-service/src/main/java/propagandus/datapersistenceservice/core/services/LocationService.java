package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.Location;
import propagandus.datapersistenceservice.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;
  public Location save(Location location){return locationRepository.save(location);}
}
