package propagandus.locationservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.locationservice.core.models.Location;
import propagandus.locationservice.core.models.enumerators.ELocationType;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {
  

  @GetMapping("{location-type}")
  public List<ELocationType> findByLocationType(ELocationType locationType){return null;}

  @GetMapping("/reaction/{city}")
  public List<Location> findLocationsByCityWithPositiveReactions(String city){return null;}

  @GetMapping("{country}")
  public List<Location> findLocationsByCountryWithNegativeReactions(String country){return null;}

  @GetMapping("{company}")
  public List<Location> findLocationsWithAdvertisementsByCompany(String company){return null;}

  @GetMapping("{city}")
  public List<Object[]> countReactionsByTypeInCity(String city){return null;}

  @GetMapping("{product}")
  public List<Location> findLocationsWithReactionsByProduct(String product){return null;}

  @GetMapping("/advertising/{advertising}/reaction/{reaction}")
  public List<Location> findLocationsWithMoreThanXReactionsForAdvertising(String advertisingName, Long reactionCount){return null;}

  @GetMapping("{state}")
  public List<Location> findLocationsWithAdvertisementsAndReactionsByState(String state){return null;}
}