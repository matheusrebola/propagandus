package propagandus.datalake.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.Location;
import propagandus.datalake.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;

  public List<Location> findAll(){return locationRepository.findAll();}
  public Location findById(Long id){return locationRepository.findById(id).orElse(null);}
  public Location save(Location location){return locationRepository.save(location);}
  public boolean exists(Long id){return locationRepository.existsById(id);}
}
