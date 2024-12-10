package propagandus.attentionservice.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.models.Attention;
import propagandus.attentionservice.core.models.Painel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.attentionservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;

  //repository
  public List<Attention> findAll(){return attentionRepository.findAll();}
  public Attention findById(Long id){return attentionRepository.findById(id).orElse(null);}
  public List<Byte> findByAttentionLevel(Byte attention){return findByAttentionLevel(attention);}
  public List<Short> findByLookCount(Short lookCount){return findByLookCount(lookCount);}
  public List<Short> findByPeopleCount(Short peopleCount){return findByPeopleCount(peopleCount);}

  //view
  public List<Object[]> findPainelsWithHighestAttentionByCity(String city){return attentionRepository.findPainelsWithHighestAttentionByCity(city);}
  public List<Painel> findPainelsWithAttentionAboveThreshold(Short threshold){return attentionRepository.findPainelsWithAttentionAboveThreshold(threshold);}
  public List<Object[]> findPeakAttentionPeriodsByPainel(Long painelId){return attentionRepository.findPeakAttentionPeriodsByPainel(painelId);}
  public List<Object[]> findPainelsWithHighestAttentionByMonth(EMonth month){return attentionRepository.findPainelsWithHighestAttentionByMonth(month);}
  public List<Object[]> findAverageAttentionByPainelInCity(String city){return attentionRepository.findAverageAttentionByPainelInCity(city);}
  public List<Object[]> findPainelsWithMostPeopleInPeriod(EPeriodOfTheDay period){return attentionRepository.findPainelsWithMostPeopleInPeriod(period);}
  public List<Object[]> findAverageAttentionByCity(){return attentionRepository.findAverageAttentionByCity();}
  public List<Object[]> findPainelsWithMostLooks(){return attentionRepository.findPainelsWithMostLooks();}
  public List<Object[]> findHighestAttentionByPainelModel(){return attentionRepository.findHighestAttentionByPainelModel();}
  public Long findTotalLooksForPainelInWeek(Long painelId){return attentionRepository.findTotalLooksForPainelInWeek(painelId);}
  public List<Object[]> findPainelsWithMostPeopleAtNight(){return attentionRepository.findPainelsWithMostPeopleAtNight();}
  public List<Object[]> findHighestAttentionByState(){return attentionRepository.findHighestAttentionByState();}
  public List<Object[]> findInteractionCountByPainelAndMonth(EMonth month){return attentionRepository.findInteractionCountByPainelAndMonth(month);}
  public List<Object[]> findAveragePeopleCountByCity(String city){return attentionRepository.findAveragePeopleCountByCity(city);}
  public List<Object[]> findPainelsWithMostInteractionsAtHour(Byte hour){return attentionRepository.findPainelsWithMostInteractionsAtHour(hour);}
  public List<Object[]> countLooksByCityAndPeriod(){return attentionRepository.countLooksByCityAndPeriod();}
  public List<Object[]> findMostViewedPainelsByDate(LocalDateTime date){return attentionRepository.findMostViewedPainelsByDate(date);}
  public List<Object[]> findHighestAttentionLevelByPainelInState(String state){return attentionRepository.findHighestAttentionLevelByPainelInState(state);}
  public List<Object[]> findAverageLooksByPainelAtHour(Byte hour){return attentionRepository.findAverageLooksByPainelAtHour(hour);}
  public List<Object[]> findPainelsWithMostInteractionsByDayOfWeek(EDayWeek dayWeek){return attentionRepository.findPainelsWithMostInteractionsByDayOfWeek(dayWeek);}
}
