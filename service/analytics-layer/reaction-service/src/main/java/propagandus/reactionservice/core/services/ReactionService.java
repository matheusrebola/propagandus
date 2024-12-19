package propagandus.reactionservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.reactionservice.core.dtos.CityInteractionCountDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByAdvertisingDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByPainelAndPeriodDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByTypeAndCityDTO;
import propagandus.reactionservice.core.dtos.ReactionDTO;
import propagandus.reactionservice.core.models.Reaction;
import propagandus.reactionservice.core.models.enumerators.EDayWeek;
import propagandus.reactionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.reactionservice.core.models.enumerators.EReactionType;
import propagandus.reactionservice.core.repositorys.ReactionRepository;

@Service
@RequiredArgsConstructor
public class ReactionService {
  /*
  private final ReactionRepository reactionRepository;

  //repository
  public Reaction findById(Long id){return reactionRepository.findById(id).orElse(null);}
  public boolean existsById(Long id){return reactionRepository.existsById(id);}
  List<EReactionType> findByReactionType(EReactionType reactionType){return reactionRepository.findByReactionType(reactionType);}

  //view
  public List<ReactionDTO> findByCityAndReactionType(String city, EReactionType reactionType){return reactionRepository.findByCityAndReactionType(city, reactionType);}
  public List<ReactionCountByAdvertisingDTO> countReactionsByAdvertising(){return reactionRepository.countReactionsByAdvertising();}
  public List<ReactionDTO> findByZipCode(String zipCode){return reactionRepository.findByZipCode(zipCode);}
  public List<ReactionDTO> findReactionsByProduct(String product){return reactionRepository.findReactionsByProduct(product);}
  public List<ReactionCountByTypeAndCityDTO> countReactionsByTypeAndCity(){return reactionRepository.countReactionsByTypeAndCity();}
  public List<ReactionDTO> findReactionsByAdvertisingVersion(String version){return reactionRepository.findReactionsByAdvertisingVersion(version);}
  public List<ReactionCountByPainelAndPeriodDTO> countReactionsByPainelAndPeriod(){return reactionRepository.countReactionsByPainelAndPeriod();}
  public List<ReactionDTO> findReactionsByDayOfWeek(EDayWeek dayWeek){return reactionRepository.findReactionsByDayOfWeek(dayWeek);}
  public List<CityInteractionCountDTO> findCitiesWithMostWeekdayInteractions(){return reactionRepository.findCitiesWithMostWeekdayInteractions();}
  public List<ReactionDTO> findReactionsByLocationAndPeriod(String city, EPeriodOfTheDay period){return reactionRepository.findReactionsByLocationAndPeriod(city, period);}
  */
}
