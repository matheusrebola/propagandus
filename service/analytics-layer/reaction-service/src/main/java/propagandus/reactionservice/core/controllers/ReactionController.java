package propagandus.reactionservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.models.Reaction;
import propagandus.reactionservice.core.models.enumerators.EDayWeek;
import propagandus.reactionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.reactionservice.core.models.enumerators.EReactionType;

@RestController
@RequestMapping("/reaction")
@RequiredArgsConstructor
public class ReactionController {
  
  public List<Reaction> findAll(){return null;}
  public Reaction findById(Long id){return null;}
  public boolean existsById(Long id){return false;}
  List<EReactionType> findByReactionType(EReactionType reactionType){return null;}
  public List<Reaction> findByCityAndReactionType(String city, EReactionType reactionType){return null;}
  public List<Object[]> countReactionsByAdvertising(){return null;}
  public List<Reaction> findByZipCode(String zipCode){return null;}
  public List<Reaction> findReactionsByProduct(String product){return null;}
  public List<Object[]> countReactionsByTypeAndCity(){return null;}
  public List<Reaction> findReactionsByAdvertisingVersion(String version){return null;}
  public List<Object[]> countReactionsByPainelAndPeriod(){return null;}
  public List<Reaction> findReactionsByDayOfWeek(EDayWeek dayWeek){return null;}
  public List<Object[]> findCitiesWithMostWeekdayInteractions(){return null;}
  public List<Reaction> findReactionsByLocationAndPeriod(String city, EPeriodOfTheDay period){return null;}
}
