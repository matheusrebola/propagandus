package propagandus.staticregisterservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.staticregisterservice.core.models.Location;
import propagandus.staticregisterservice.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;
  public Location save(Location location){return locationRepository.save(location);}
}
