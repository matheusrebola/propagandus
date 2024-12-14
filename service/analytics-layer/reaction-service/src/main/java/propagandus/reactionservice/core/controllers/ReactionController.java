package propagandus.reactionservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.dtos.CityInteractionCountDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByAdvertisingDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByPainelAndPeriodDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByTypeAndCityDTO;
import propagandus.reactionservice.core.models.Reaction;
import propagandus.reactionservice.core.models.enumerators.EDayWeek;
import propagandus.reactionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.reactionservice.core.models.enumerators.EReactionType;

@RestController
@RequestMapping("/reaction")
@RequiredArgsConstructor
public class ReactionController {

  @GetMapping("/by-advertising")
  public List<ReactionCountByAdvertisingDTO> countReactionsByAdvertising(){return null;}

  @GetMapping("/by-type-and-city")
  public List<ReactionCountByTypeAndCityDTO> countReactionsByTypeAndCity(){return null;}

  @GetMapping("/cities-with-most-weekday-interactions")
  public List<CityInteractionCountDTO> findCitiesWithMostWeekdayInteractions(){return null;}

  @GetMapping("/by-painel-and-period")
  public List<ReactionCountByPainelAndPeriodDTO> countReactionsByPainelAndPeriod(){return null;}
  
  @GetMapping("{reaction-type}")
  List<EReactionType> findByReactionType(@PathVariable EReactionType reactionType){return null;}

  @GetMapping("/city/{city}/reaction/{reaction-type}")
  public List<Reaction> findByCityAndReactionType(@PathVariable String city, @PathVariable EReactionType reactionType){return null;}

  @GetMapping("/location/{zip-code}")
  public List<Reaction> findByZipCode(@PathVariable String zipCode){return null;}

  @GetMapping("{product}")
  public List<Reaction> findReactionsByProduct(@PathVariable String product){return null;}

  @GetMapping("{version}")
  public List<Reaction> findReactionsByAdvertisingVersion(@PathVariable String version){return null;}

  @GetMapping("{day-week}")
  public List<Reaction> findReactionsByDayOfWeek(@PathVariable EDayWeek dayWeek){return null;}

  @GetMapping("/city/{city}/period/{period}")
  public List<Reaction> findReactionsByLocationAndPeriod(@PathVariable String city, @PathVariable EPeriodOfTheDay period){return null;}
}
