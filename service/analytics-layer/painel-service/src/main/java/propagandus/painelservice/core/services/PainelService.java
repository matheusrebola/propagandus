package propagandus.painelservice.core.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.dtos.PainelCityStatusCountDTO;
import propagandus.painelservice.core.dtos.PainelDTO;
import propagandus.painelservice.core.dtos.PainelHourInteractionDTO;
import propagandus.painelservice.core.dtos.PainelInteractionCountDTO;
import propagandus.painelservice.core.dtos.PainelModelCountDTO;
import propagandus.painelservice.core.dtos.PainelModelPeopleCountDTO;
import propagandus.painelservice.core.dtos.PainelModelStateCountDTO;
import propagandus.painelservice.core.dtos.PainelStateCountDTO;
import propagandus.painelservice.core.dtos.PainelStatusInteractionCountDTO;
import propagandus.painelservice.core.dtos.StateAverageInteractionsDTO;

import propagandus.painelservice.core.models.enumerators.EStatus;

import propagandus.painelservice.core.repositorys.PainelRepository;

@Service
@RequiredArgsConstructor
public class PainelService {
  private final PainelRepository painelRepository;

  //repository
  public boolean existsById(UUID id){return painelRepository.existsById(id);}
  String findByIdentification(String identification){return painelRepository.findByIdentification(identification);}
  List<EStatus> findByEStatus(EStatus status){return painelRepository.findByStatus(status);}
  List<String> findByModel(String model){return painelRepository.findByModel(model);}

  //view
  public List<PainelDTO> findActivePainelsByCity(String city){return painelRepository.findActivePainelsByCity(city);}
  public List<PainelStatusInteractionCountDTO> countInteractionsByPainelStatusInCity(String city){return painelRepository.countInteractionsByPainelStatusInCity(city);}
  public List<PainelModelCountDTO> findActivePainelsByModel(){return painelRepository.findActivePainelsByModel();}
  public List<PainelDTO> findPainelsWithNoAttention(){return painelRepository.findPainelsWithNoAttention();}
  public List<PainelDTO> findByStatusAndCity(EStatus status, String city){return painelRepository.findByStatusAndCity(status, city);}
  public List<PainelStateCountDTO> countPainelsByState(){return painelRepository.countPainelsByState();}
  public List<PainelInteractionCountDTO> findPainelsWithMostInteractions(){return painelRepository.findPainelsWithMostInteractions();}
  public List<PainelCityStatusCountDTO> countPainelsByCityAndStatus(){return painelRepository.countPainelsByCityAndStatus();}
  public List<PainelDTO> findPainelsWithAttentionAboveLevel(Byte level){return painelRepository.findPainelsWithAttentionAboveLevel(level);}
  public List<PainelModelPeopleCountDTO> findModelsWithMostPeopleRegistered(){return painelRepository.findModelsWithMostPeopleRegistered();}
  public List<PainelModelStateCountDTO> countPainelsByModelInState(String state){return painelRepository.countPainelsByModelInState(state);}
  public List<StateAverageInteractionsDTO> findAverageInteractionsByState(){return painelRepository.findAverageInteractionsByState();}
  public List<PainelHourInteractionDTO> findMostInteractivePainelsByHour(Byte hour){return painelRepository.findMostInteractivePainelsByHour(hour);}
}
