package propagandus.painelservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.dtos.PainelCityStatusCountDTO;
import propagandus.painelservice.core.dtos.PainelDTO;
import propagandus.painelservice.core.dtos.PainelInteractionCountDTO;
import propagandus.painelservice.core.dtos.PainelModelCountDTO;
import propagandus.painelservice.core.dtos.PainelModelPeopleCountDTO;
import propagandus.painelservice.core.dtos.PainelStateCountDTO;
import propagandus.painelservice.core.dtos.StateAverageInteractionsDTO;
import propagandus.painelservice.core.models.Painel;

@RestController
@RequestMapping("/painel")
@RequiredArgsConstructor
public class PainelController {

  @GetMapping("/by-model")
  public List<PainelModelCountDTO> findActivePainelsByModel(){return null;}

  @GetMapping("/no-attetion")
  public List<PainelDTO> findPainelsWithNoAttention(){return null;}

  @GetMapping("/by-state")
  public List<PainelStateCountDTO> countPainelsByState(){return null;}

  @GetMapping("/most-reactions")
  public List<PainelInteractionCountDTO> findPainelsWithMostInteractions(){return null;}

  @GetMapping("/by-city-and-status")
  public List<PainelCityStatusCountDTO> countPainelsByCityAndStatus(){return null;}

  @GetMapping("/most-people-registered")
  public List<PainelModelPeopleCountDTO> findModelsWithMostPeopleRegistered(){return null;}

  @GetMapping("/average-interactions-by-state")
  public List<StateAverageInteractionsDTO> findAverageInteractionsByState(){return null;}

  @GetMapping("{identification}")
  String findByIdentification(@PathVariable String identification){return null;}

  @GetMapping("{model}")
  List<String> findByModel(@PathVariable String model){return null;}

  @GetMapping("/active/{city}")
  public List<Painel> findActivePainelsByCity(@PathVariable String city){return null;}

  @GetMapping("{city}")
  public List<Object[]> countInteractionsByPainelStatusInCity(@PathVariable String city){return null;}

  @GetMapping("/active/{model}")
  public List<Painel> findActivePainelsByModel(@PathVariable String model){return null;}

  @GetMapping("{level}")
  public List<Painel> findPainelsWithAttentionAboveLevel(@PathVariable Byte level){return null;}

  @GetMapping("{state}")
  public List<Object[]> countPainelsByModelInState(@PathVariable String state){return null;}

  @GetMapping("{hour}")
  public List<Object[]> findMostInteractivePainelsByHour(@PathVariable Byte hour){return null;}
}
