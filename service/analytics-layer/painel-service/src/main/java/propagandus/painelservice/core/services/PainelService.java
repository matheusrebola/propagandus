package propagandus.painelservice.core.services;

import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;

  //repository
  public boolean existsById(Long id){return painelRepository.existsById(id);}
  String findByIdentification(String identification){return painelRepository.findByIdentification(identification);}
  List<String> findByModel(String model){return painelRepository.findByModel(model);}

  //view
  /*public List<PainelDTO> findActivePainelsByCity(String city){return painelRepository.findActivePainelsByCity(city);}
  public List<Long> countInteractionsByPainelStatusInCity(String city){return painelRepository.countInteractionsByPainelStatusInCity(city);}
  public List<PainelModelCountDTO> findActivePainelsByModel(){return painelRepository.findActivePainelsByModel();}
  public List<PainelDTO> findPainelsWithNoAttention(){return painelRepository.findPainelsWithNoAttention();}
  public List<PainelStateCountDTO> countPainelsByState(){return painelRepository.countPainelsByState();}
  public List<PainelInteractionCountDTO> findPainelsWithMostInteractions(){return painelRepository.findPainelsWithMostInteractions();}
  public List<PainelCityStatusCountDTO> countPainelsByCityAndStatus(){return painelRepository.countPainelsByCityAndStatus();}
  public List<PainelDTO> findPainelsWithAttentionAboveLevel(Byte level){return painelRepository.findPainelsWithAttentionAboveLevel(level);}
  public List<PainelModelPeopleCountDTO> findModelsWithMostPeopleRegistered(){return painelRepository.findModelsWithMostPeopleRegistered();}
  public List<PainelModelStateCountDTO> countPainelsByModelInState(String state){return painelRepository.countPainelsByModelInState(state);}
  public List<StateAverageInteractionsDTO> findAverageInteractionsByState(){return painelRepository.findAverageInteractionsByState();}
  public List<PainelHourInteractionDTO> findMostInteractivePainelsByHour(Byte hour){return painelRepository.findMostInteractivePainelsByHour(hour);}
  */
}
