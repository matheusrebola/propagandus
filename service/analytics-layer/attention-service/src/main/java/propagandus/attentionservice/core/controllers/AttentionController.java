package propagandus.attentionservice.core.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.models.Attention;
import propagandus.attentionservice.core.models.Painel;
import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

@RestController
@RequestMapping("/attention")
@RequiredArgsConstructor
public class AttentionController {
  
  public Attention findById(Long id){return null;}
  List<EAttentionLevel> findByAttention(EAttentionLevel attention){return null;}
  public List<Byte> findByAttentionLevel(Byte attention){return null;}
  public List<Short> findByLookCount(Short lookCount){return null;}
  public List<Short> findByPeopleCount(Short peopleCount){return null;}
  public List<Object[]> findPainelsWithHighestAttentionByCity(String city){return null;}
  public List<Painel> findPainelsWithAttentionAboveThreshold(Short threshold){return null;}
  public List<Object[]> findPeakAttentionPeriodsByPainel(Long painelId){return null;}
  public List<Object[]> findPainelsWithHighestAttentionByMonth(EMonth month){return null;}
  public List<Object[]> findAverageAttentionByPainelInCity(String city){return null;}
  public List<Object[]> findPainelsWithMostPeopleInPeriod(EPeriodOfTheDay period){return null;}
  public Long findTotalLooksForPainelInWeek(Long painelId){return null;}
  public List<Object[]> findInteractionCountByPainelAndMonth(EMonth month){return null;}
  public List<Object[]> findAveragePeopleCountByCity(String city){return null;}
  public List<Object[]> findPainelsWithMostInteractionsAtHour(Byte hour){return null;}
  public List<Object[]> findMostViewedPainelsByDate(LocalDateTime date){return null;}
  public List<Object[]> findHighestAttentionLevelByPainelInState(String state){return null;}
  public List<Object[]> findAverageLooksByPainelAtHour(Byte hour){return null;}
  public List<Object[]> findPainelsWithMostInteractionsByDayOfWeek(EDayWeek dayWeek){return null;}

}
