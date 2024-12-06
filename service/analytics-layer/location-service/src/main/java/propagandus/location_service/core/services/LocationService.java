package propagandus.location_service.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.location_service.core.models.Location;
import propagandus.location_service.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;

  public List<Location> findAll(){return locationRepository.findAll();}
  public Location findById(Long id){return locationRepository.findById(id).orElse(null);}
  public Location save(Location location){return locationRepository.save(location);}
  public List<String> findByZipCode (String zipCode){return locationRepository.findByZipCode(zipCode);}
  public List<String> findByPublicPlace (String publicPlace){return locationRepository.findByPublicPlace(publicPlace);}
  public List<String> findByPublicPlaceAndNumber(String publicPlace, String number){return locationRepository.findByPublicPlaceAndNumber(publicPlace, number);}
}
