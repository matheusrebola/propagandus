package propagandus.datalake.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.Location;
import propagandus.datalake.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;
  public Location save(Location location){return locationRepository.save(location);}
}
