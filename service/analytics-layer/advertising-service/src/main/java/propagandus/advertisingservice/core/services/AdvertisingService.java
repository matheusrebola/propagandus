package propagandus.advertisingservice.core.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.dtos.AdvertisingCityReactionCountDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingDetailsDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingReactionCountDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingReactionTypeCountDTO;
import propagandus.advertisingservice.core.dtos.ProductReactionCountDTO;
import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;
import propagandus.advertisingservice.core.repositorys.AdvertisingRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;

  //repository
  public Advertising findById(UUID id){return advertisingRepository.findById(id).orElse(null);}
  public boolean exists(UUID id){return advertisingRepository.existsById(id);}
  public List<String> findByName(String name){return advertisingRepository.findByName(name);}
  public List<String> findByCompany(String company){return advertisingRepository.findByCompany(company);}
  public List<String> findByProduct(String product){return advertisingRepository.findByProduct(product);}

  //view
  public List<AdvertisingDTO> findByReactionType(EReactionType reactionType){return advertisingRepository.findByReactionType(reactionType);}
  public List<AdvertisingDTO> findPositiveReactionsByCompany(String company){return advertisingRepository.findPositiveReactionsByCompany(company);}
  public List<AdvertisingDTO> findByCityWithReactions(String city){return findByCityWithReactions(city);}
  public List<AdvertisingDetailsDTO> findAdvertisingDetailsWithReactions(String name){return advertisingRepository.findAdvertisingDetailsWithReactions(name);}
  public List<AdvertisingDTO> findByStateWithReactions(String state){return advertisingRepository.findByStateWithReactions(state);}
  public List<AdvertisingReactionCountDTO> countReactionsByAdvertising(){return advertisingRepository.countReactionsByAdvertising();}
  public List<AdvertisingCityReactionCountDTO> findAdvertisingWithMostReactionsInCity(String city){return advertisingRepository.findAdvertisingWithMostReactionsInCity(city);}
  public List<AdvertisingReactionTypeCountDTO> findAdvertisingWithMostReactionsByType(EReactionType reactionType){return advertisingRepository.findAdvertisingWithMostReactionsByType(reactionType);}
  public List<ProductReactionCountDTO> countReactionsByProduct(){return advertisingRepository.countReactionsByProduct();}
  public List<AdvertisingDTO> findAdvertisingByPainel(Long painelId){return advertisingRepository.findAdvertisingByPainel(painelId);}
  public List<ProductReactionCountDTO> countReactionsByAdvertisingAndCity(){return advertisingRepository.countReactionsByAdvertisingAndCity();}
  public List<AdvertisingDTO> findAdvertisingByProductWithReactionsAboveThreshold(String product, Long threshold){return advertisingRepository.findAdvertisingByProductWithReactionsAboveThreshold(product, threshold);}
  public List<AdvertisingDTO> findAdvertisingInLocationsWithMorePainels(Byte painelCount){return advertisingRepository.findAdvertisingInLocationsWithMorePainels(painelCount);}
}
