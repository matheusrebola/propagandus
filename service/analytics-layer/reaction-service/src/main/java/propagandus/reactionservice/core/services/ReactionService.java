package propagandus.reactionservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.models.Reaction;
import propagandus.reactionservice.core.models.enumerators.EDayWeek;
import propagandus.reactionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.reactionservice.core.models.enumerators.EReactionType;
import propagandus.reactionservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  private final ReactionRepository reactionRepository;

  //repository
  public List<Reaction> findAll(){return reactionRepository.findAll();}
  public Reaction findById(Long id){return reactionRepository.findById(id).orElse(null);}
  public boolean existsById(Long id){return reactionRepository.existsById(id);}

  //view
  public List<Reaction> findByCityAndReactionType(String city, EReactionType reactionType){return reactionRepository.findByCityAndReactionType(city, reactionType);}
  public List<Object[]> countReactionsByAdvertising(){return reactionRepository.countReactionsByAdvertising();}
  public List<Reaction> findByZipCode(String zipCode){return reactionRepository.findByZipCode(zipCode);}
  public List<Reaction> findReactionsByProduct(String product){return reactionRepository.findReactionsByProduct(product);}
  public List<Object[]> countReactionsByTypeAndCity(){return reactionRepository.countReactionsByTypeAndCity();}
  public List<Reaction> findReactionsByAdvertisingVersion(String version){return reactionRepository.findReactionsByAdvertisingVersion(version);}
  public List<Object[]> countReactionsByPainelAndPeriod(){return reactionRepository.countReactionsByPainelAndPeriod();}
  public List<Reaction> findReactionsByDayOfWeek(EDayWeek dayWeek){return reactionRepository.findReactionsByDayOfWeek(dayWeek);}
  public List<Object[]> findCitiesWithMostWeekdayInteractions(){return reactionRepository.findCitiesWithMostWeekdayInteractions();}
  public List<Reaction> findReactionsByLocationAndPeriod(String city, EPeriodOfTheDay period){return reactionRepository.findReactionsByLocationAndPeriod(city, period);}
}
