package propagandus.locationservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.locationservice.core.models.Location;
import propagandus.locationservice.core.models.enumerators.ELocationType;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {
  
  public List<Location> findAll(){return null;}
  public Location findById(Long id){return null;}
  public boolean existsByID(Long id){return false;}
  public List<String> findByZipCode(String zipCode){return null;}
  public List<String> findByPublicPlace(String publicPlace){return null;}
  public List<ELocationType> findByLocationType(ELocationType locationType){return null;}
  public List<Object[]> findLocationsWithMostReactions(){return null;}
  public List<Location> findLocationsWithAdvertisements(){return null;}
  public List<Location> findLocationsByCityWithPositiveReactions(String city){return null;}
  public List<Location> findLocationsWithReactions(){return null;}
  public List<Object[]> countAdvertisementsByState(){return null;}
  public List<Location> findLocationsByCountryWithNegativeReactions(String country){return null;}
  public List<Location> findLocationsWithAdvertisementsByCompany(String company){return null;}
  public List<Object[]> countReactionsByTypeInCity(String city){return null;}
  public List<Object[]> findLocationsWithAdvertisementsAndReactions(){return null;}
  public List<Location> findLocationsWithReactionsByProduct(String product){return null;}
  public List<Object[]> countReactionsByState(){return null;}
  public List<Location> findLocationsWithMoreThanXReactionsForAdvertising(String advertisingName, Long reactionCount){return null;}
  public List<Location> findLocationsWithAdvertisementsAndReactionsByState(String state){return null;}
  public List<Object[]> countPositiveReactionsByCity(){return null;}
  public List<Location> findLocationsWithoutReactions(){return null;}
}
