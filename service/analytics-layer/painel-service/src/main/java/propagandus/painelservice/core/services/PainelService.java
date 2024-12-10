package propagandus.painelservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.models.Painel;
import propagandus.painelservice.core.models.enumerators.EStatus;
import propagandus.painelservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;

  //repository
  public List<Painel> findAll(){return painelRepository.findAll();}
  public Painel findById(Long id){return painelRepository.findById(id).orElse(null);}
  public boolean existsById(Long id){return painelRepository.existsById(id);}

  //view
  public List<Painel> findActivePainelsByCity(String city){return painelRepository.findActivePainelsByCity(city);}
  public List<Object[]> countInteractionsByPainelStatusInCity(String city){return painelRepository.countInteractionsByPainelStatusInCity(city);}
  public List<Object[]> findActivePainelsByModel(){return painelRepository.findActivePainelsByModel();}
  public List<Painel> findPainelsWithNoAttention(){return painelRepository.findPainelsWithNoAttention();}
  public List<Painel> findByStatusAndCity(EStatus status, String city){return painelRepository.findByStatusAndCity(status, city);}
  public List<Object[]> countPainelsByState(){return painelRepository.countPainelsByState();}
  public List<Object[]> findPainelsWithMostInteractions(){return painelRepository.findPainelsWithMostInteractions();}
  public List<Painel> findActivePainelsByModel(String model){return painelRepository.findActivePainelsByModel(model);}
  public List<Object[]> countPainelsByCityAndStatus(){return painelRepository.countPainelsByCityAndStatus();}
  public List<Painel> findPainelsWithAttentionAboveLevel(Byte level){return painelRepository.findPainelsWithAttentionAboveLevel(level);}
  public List<Object[]> findModelsWithMostPeopleRegistered(){return painelRepository.findModelsWithMostPeopleRegistered();}
  public List<Object[]> countPainelsByModelInState(String state){return painelRepository.countPainelsByModelInState(state);}
  public List<Object[]> findAverageInteractionsByState(){return painelRepository.findAverageInteractionsByState();}
  public List<Object[]> findMostInteractivePainelsByHour(Byte hour){return painelRepository.findMostInteractivePainelsByHour(hour);}
}
