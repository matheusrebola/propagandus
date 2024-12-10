package propagandus.painelservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.models.Painel;
import propagandus.painelservice.core.models.enumerators.EStatus;

@RestController
@RequestMapping("/painel")
@RequiredArgsConstructor
public class PainelController {
  public List<Painel> findAll(){return null;}
  public Painel findById(Long id){return null;}
  public boolean existsById(Long id){return false;}
  String findByIdentification(String identification){return null;}
  List<EStatus> findByEStatus(EStatus status){return null;}
  List<String> findByModel(String model){return null;}
  public List<Painel> findActivePainelsByCity(String city){return null;}
  public List<Object[]> countInteractionsByPainelStatusInCity(String city){return null;}
  public List<Object[]> findActivePainelsByModel(){return null;}
  public List<Painel> findPainelsWithNoAttention(){return null;}
  public List<Painel> findByStatusAndCity(EStatus status, String city){return null;}
  public List<Object[]> countPainelsByState(){return null;}
  public List<Object[]> findPainelsWithMostInteractions(){return null;}
  public List<Painel> findActivePainelsByModel(String model){return null;}
  public List<Object[]> countPainelsByCityAndStatus(){return null;}
  public List<Painel> findPainelsWithAttentionAboveLevel(Byte level){return null;}
  public List<Object[]> findModelsWithMostPeopleRegistered(){return null;}
  public List<Object[]> countPainelsByModelInState(String state){return null;}
  public List<Object[]> findAverageInteractionsByState(){return null;}
  public List<Object[]> findMostInteractivePainelsByHour(Byte hour){return null;}
}
