package propagandus.attentionservice.core.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.dtos.AttentionLevelDTO;
import propagandus.attentionservice.core.dtos.AverageAttentionDTO;
import propagandus.attentionservice.core.dtos.CityPeriodLookDTO;
import propagandus.attentionservice.core.dtos.PainelAttentionDTO;
import propagandus.attentionservice.core.dtos.PainelAttentionPeriodDTO;
import propagandus.attentionservice.core.dtos.PainelAttentionStateDTO;
import propagandus.attentionservice.core.dtos.PainelDTO;
import propagandus.attentionservice.core.dtos.PainelInteractionDTO;
import propagandus.attentionservice.core.models.Attention;
import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.attentionservice.core.repositorys.AttentionRepository;

@Service
@RequiredArgsConstructor
public class AttentionService {
  private final AttentionRepository attentionRepository;

  //repository
  public Attention findById(Long id){return attentionRepository.findById(id).orElse(null);}
  List<EAttentionLevel> findByAttention(EAttentionLevel attention){return attentionRepository.findByAttention(attention);}
  public List<Byte> findByAttentionLevel(Byte attention){return findByAttentionLevel(attention);}
  public List<Short> findByLookCount(Short lookCount){return findByLookCount(lookCount);}
  public List<Short> findByPeopleCount(Short peopleCount){return findByPeopleCount(peopleCount);}

  //view
  public List<PainelAttentionDTO> findPainelsWithHighestAttentionByCity(String city){return attentionRepository.findPainelsWithHighestAttentionByCity(city);}
  public List<PainelDTO> findPainelsWithAttentionAboveThreshold(Short threshold){return attentionRepository.findPainelsWithAttentionAboveThreshold(threshold);}
  public List<PainelAttentionPeriodDTO> findPeakAttentionPeriodsByPainel(Long painelId){return attentionRepository.findPeakAttentionPeriodsByPainel(painelId);}
  public List<PainelAttentionDTO> findPainelsWithHighestAttentionByMonth(EMonth month){return attentionRepository.findPainelsWithHighestAttentionByMonth(month);}
  public List<AverageAttentionDTO> findAverageAttentionByPainelInCity(String city){return attentionRepository.findAverageAttentionByPainelInCity(city);}
  public List<Object[]> findPainelsWithMostPeopleInPeriod(EPeriodOfTheDay period){return attentionRepository.findPainelsWithMostPeopleInPeriod(period);}
  public List<AverageAttentionDTO> findAverageAttentionByCity(){return attentionRepository.findAverageAttentionByCity();}
  public List<Object[]> findPainelsWithMostLooks(){return attentionRepository.findPainelsWithMostLooks();}
  public List<AttentionLevelDTO> findHighestAttentionByPainelModel(){return attentionRepository.findHighestAttentionByPainelModel();}
  public Integer findTotalLooksForPainelInWeek(Long painelId){return attentionRepository.findTotalLooksForPainelInWeek(painelId);}
  public List<PainelAttentionDTO> findPainelsWithMostPeopleAtNight(){return attentionRepository.findPainelsWithMostPeopleAtNight();}
  public List<AttentionLevelDTO> findHighestAttentionByState(){return attentionRepository.findHighestAttentionByState();}
  public List<PainelAttentionDTO> findInteractionCountByPainelAndMonth(EMonth month){return attentionRepository.findInteractionCountByPainelAndMonth(month);}
  public List<Object[]> findAveragePeopleCountByCity(String city){return attentionRepository.findAveragePeopleCountByCity(city);}
  public List<PainelInteractionDTO> findPainelsWithMostInteractionsAtHour(Byte hour){return attentionRepository.findPainelsWithMostInteractionsAtHour(hour);}
  public List<CityPeriodLookDTO> countLooksByCityAndPeriod(){return attentionRepository.countLooksByCityAndPeriod();}
  public List<PainelAttentionDTO> findMostViewedPainelsByDate(LocalDateTime date){return attentionRepository.findMostViewedPainelsByDate(date);}
  public List<PainelAttentionStateDTO> findHighestAttentionLevelByPainelInState(String state){return attentionRepository.findHighestAttentionLevelByPainelInState(state);}
  public List<AverageAttentionDTO> findAverageLooksByPainelAtHour(Byte hour){return attentionRepository.findAverageLooksByPainelAtHour(hour);}
  public List<PainelInteractionDTO> findPainelsWithMostInteractionsByDayOfWeek(EDayWeek dayWeek){return attentionRepository.findPainelsWithMostInteractionsByDayOfWeek(dayWeek);}
}
