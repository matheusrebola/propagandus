package propagandus.attentionservice.core.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.attentionservice.core.models.Painel;
import propagandus.attentionservice.core.models.enumerators.EAttentionLevel;
import propagandus.attentionservice.core.models.enumerators.EDayWeek;
import propagandus.attentionservice.core.models.enumerators.EMonth;
import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

@RestController
@RequestMapping("/attention")
@RequiredArgsConstructor
public class AttentionController {

  @GetMapping("{attention-level}")
  List<EAttentionLevel> findByAttention(@PathVariable EAttentionLevel attention){return null;}

  @GetMapping("{attention}")
  public List<Byte> findByAttentionLevel(@PathVariable Byte attention){return null;}

  @GetMapping("{look-count}")
  public List<Short> findByLookCount(@PathVariable Short lookCount){return null;}

  @GetMapping("{people-count}")
  public List<Short> findByPeopleCount(@PathVariable Short peopleCount){return null;}

  @GetMapping("{city}")
  public List<Object[]> findPainelsWithHighestAttentionByCity(@PathVariable String city){return null;}
  
  @GetMapping("{threshold}")
  public List<Painel> findPainelsWithAttentionAboveThreshold(@PathVariable Short threshold){return null;}

  @GetMapping("/painel/{painel}")
  public List<Object[]> findPeakAttentionPeriodsByPainel(@PathVariable Long painelId){return null;}

  @GetMapping("{month}")
  public List<Object[]> findPainelsWithHighestAttentionByMonth(@PathVariable EMonth month){return null;}

  @GetMapping("/painel/{city}")
  public List<Object[]> findAverageAttentionByPainelInCity(@PathVariable String city){return null;}

  @GetMapping("{period}")
  public List<Object[]> findPainelsWithMostPeopleInPeriod(@PathVariable EPeriodOfTheDay period){return null;}

  @GetMapping("{painel-id}")
  public Long findTotalLooksForPainelInWeek(@PathVariable Long painelId){return null;}

  @GetMapping("/painel/{month}")
  public List<Object[]> findInteractionCountByPainelAndMonth(@PathVariable EMonth month){return null;}

  @GetMapping("{city-name}")
  public List<Object[]> findAveragePeopleCountByCity(@PathVariable String city){return null;}

  @GetMapping("{hour}")
  public List<Object[]> findPainelsWithMostInteractionsAtHour(@PathVariable Byte hour){return null;}

  @GetMapping("{date}")
  public List<Object[]> findMostViewedPainelsByDate(@PathVariable LocalDateTime date){return null;}

  @GetMapping("{state}")
  public List<Object[]> findHighestAttentionLevelByPainelInState(@PathVariable String state){return null;}

  @GetMapping("/painel/{hour}")
  public List<Object[]> findAverageLooksByPainelAtHour(@PathVariable Byte hour){return null;}

  @GetMapping("/painel/{day-week}")
  public List<Object[]> findPainelsWithMostInteractionsByDayOfWeek(@PathVariable EDayWeek dayWeek){return null;}

}
