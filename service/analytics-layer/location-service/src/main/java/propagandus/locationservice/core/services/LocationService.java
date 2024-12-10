package propagandus.locationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.locationservice.core.models.Location;
import propagandus.locationservice.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;

  //repository
  public List<Location> findAll(){return locationRepository.findAll();}
  public Location findById(Long id){return locationRepository.findById(id).orElse(null);}
  public boolean existsByID(Long id){return locationRepository.existsById(id);}

  //views
  public List<Object[]> findLocationsWithMostReactions(){return locationRepository.findLocationsWithMostReactions();}
  public List<Location> findLocationsWithAdvertisements(){return locationRepository.findLocationsWithAdvertisements();}
  public List<Location> findLocationsByCityWithPositiveReactions(String city){return locationRepository.findLocationsByCityWithPositiveReactions(city);}
  public List<Location> findLocationsWithReactions(){return locationRepository.findLocationsWithReactions();}
  public List<Object[]> countAdvertisementsByState(){return locationRepository.countAdvertisementsByState();}
  public List<Location> findLocationsByCountryWithNegativeReactions(String country){return locationRepository.findLocationsByCountryWithNegativeReactions(country);}
  public List<Location> findLocationsWithAdvertisementsByCompany(String company){return locationRepository.findLocationsWithAdvertisementsByCompany(company);}
  public List<Object[]> countReactionsByTypeInCity(String city){return locationRepository.countReactionsByTypeInCity(city);}
  public List<Object[]> findLocationsWithAdvertisementsAndReactions(){return locationRepository.findLocationsWithAdvertisementsAndReactions();}
  public List<Location> findLocationsWithReactionsByProduct(String product){return locationRepository.findLocationsWithReactionsByProduct(product);}
  public List<Object[]> countReactionsByState(){return locationRepository.countReactionsByState();}
  public List<Location> findLocationsWithMoreThanXReactionsForAdvertising(String advertisingName, Long reactionCount){return locationRepository.findLocationsWithMoreThanXReactionsForAdvertising(advertisingName, reactionCount);}
  public List<Location> findLocationsWithAdvertisementsAndReactionsByState(String state){return locationRepository.findLocationsWithAdvertisementsAndReactionsByState(state);}
  public List<Object[]> countPositiveReactionsByCity(){return locationRepository.countPositiveReactionsByCity();}
  public List<Location> findLocationsWithoutReactions(){return locationRepository.findLocationsWithoutReactions();}
}
