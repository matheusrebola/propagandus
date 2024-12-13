package propagandus.locationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.locationservice.core.dtos.LocationAdvertisementDTO;
import propagandus.locationservice.core.dtos.LocationDTO;
import propagandus.locationservice.core.dtos.LocationDetailsDTO;
import propagandus.locationservice.core.dtos.LocationProductReactionDTO;
import propagandus.locationservice.core.dtos.LocationReactionCountDTO;
import propagandus.locationservice.core.dtos.LocationReactionThresholdDTO;
import propagandus.locationservice.core.dtos.ReactionTypeCountDTO;
import propagandus.locationservice.core.models.enumerators.ELocationType;
import propagandus.locationservice.core.repositorys.LocationRepository;

@Service
@RequiredArgsConstructor
public class LocationService {
  private final LocationRepository locationRepository;

  //repository
  public boolean existsById(Long id){return locationRepository.existsById(id);}
  public List<String> findByZipCode(String zipCode){return locationRepository.findByZipCode(zipCode);}
  public List<String> findByPublicPlace(String publicPlace){return locationRepository.findByPublicPlace(publicPlace);}
  public List<ELocationType> findByLocationType(ELocationType locationType){return findByLocationType(locationType);}

  //views
  public List<LocationReactionCountDTO> findLocationsWithMostReactions(){return locationRepository.findLocationsWithMostReactions();}
  public List<LocationAdvertisementDTO> findLocationsWithAdvertisements(){return locationRepository.findLocationsWithAdvertisements();}
  public List<LocationDTO> findLocationsByCityWithPositiveReactions(String city){return locationRepository.findLocationsByCityWithPositiveReactions(city);}
  public List<LocationDTO> findLocationsWithReactions(){return locationRepository.findLocationsWithReactions();}
  public List<LocationReactionCountDTO> countAdvertisementsByState(){return locationRepository.countAdvertisementsByState();}
  public List<LocationDTO> findLocationsByCountryWithNegativeReactions(String country){return locationRepository.findLocationsByCountryWithNegativeReactions(country);}
  public List<LocationAdvertisementDTO> findLocationsWithAdvertisementsByCompany(String company){return locationRepository.findLocationsWithAdvertisementsByCompany(company);}
  public List<ReactionTypeCountDTO> countReactionsByTypeInCity(String city){return locationRepository.countReactionsByTypeInCity(city);}
  public List<LocationDetailsDTO> findLocationsWithAdvertisementsAndReactions(){return locationRepository.findLocationsWithAdvertisementsAndReactions();}
  public List<LocationProductReactionDTO> findLocationsWithReactionsByProduct(String product){return locationRepository.findLocationsWithReactionsByProduct(product);}
  public List<LocationReactionCountDTO> countReactionsByState(){return locationRepository.countReactionsByState();}
  public List<LocationReactionThresholdDTO> findLocationsWithMoreThanXReactionsForAdvertising(String advertisingName, Long reactionCount){return locationRepository.findLocationsWithMoreThanXReactionsForAdvertising(advertisingName, reactionCount);}
  public List<LocationAdvertisementDTO> findLocationsWithAdvertisementsAndReactionsByState(String state){return locationRepository.findLocationsWithAdvertisementsAndReactionsByState(state);}
  public List<LocationReactionCountDTO> countPositiveReactionsByCity(){return locationRepository.countPositiveReactionsByCity();}
  public List<LocationDTO> findLocationsWithoutReactions(){return locationRepository.findLocationsWithoutReactions();}
}
