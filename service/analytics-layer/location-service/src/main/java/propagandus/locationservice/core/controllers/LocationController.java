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
  
  public List<String> findByZipCode(String zipCode){return null;}
  public List<String> findByPublicPlace(String publicPlace){return null;}
  public List<ELocationType> findByLocationType(ELocationType locationType){return null;}
  public List<Location> findLocationsByCityWithPositiveReactions(String city){return null;}
  public List<Location> findLocationsByCountryWithNegativeReactions(String country){return null;}
  public List<Location> findLocationsWithAdvertisementsByCompany(String company){return null;}
  public List<Object[]> countReactionsByTypeInCity(String city){return null;}
  public List<Location> findLocationsWithReactionsByProduct(String product){return null;}
  public List<Location> findLocationsWithMoreThanXReactionsForAdvertising(String advertisingName, Long reactionCount){return null;}
  public List<Location> findLocationsWithAdvertisementsAndReactionsByState(String state){return null;}
}