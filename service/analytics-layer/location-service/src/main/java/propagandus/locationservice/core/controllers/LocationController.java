package propagandus.locationservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  public List<ELocationType> findByLocationType(@PathVariable ELocationType locationType){return null;}

  @GetMapping("/reaction/{city}")
  public List<Location> findLocationsByCityWithPositiveReactions(@PathVariable String city){return null;}

  @GetMapping("{country}")
  public List<Location> findLocationsByCountryWithNegativeReactions(@PathVariable String country){return null;}

  @GetMapping("{company}")
  public List<Location> findLocationsWithAdvertisementsByCompany(@PathVariable String company){return null;}

  @GetMapping("{city}")
  public List<Object[]> countReactionsByTypeInCity(@PathVariable String city){return null;}

  @GetMapping("{product}")
  public List<Location> findLocationsWithReactionsByProduct(@PathVariable String product){return null;}

  @GetMapping("/advertising/{advertising}/reaction/{reaction}")
  public List<Location> findLocationsWithMoreThanXReactionsForAdvertising(@PathVariable String advertisingName, @PathVariable Long reactionCount){return null;}

  @GetMapping("{state}")
  public List<Location> findLocationsWithAdvertisementsAndReactionsByState(@PathVariable String state){return null;}
}