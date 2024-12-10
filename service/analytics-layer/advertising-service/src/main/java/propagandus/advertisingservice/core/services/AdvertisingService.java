package propagandus.advertisingservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;
import propagandus.advertisingservice.core.repositorys.AdvertisingRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;

  public List<Advertising> findAll(){return advertisingRepository.findAll();}
  public Advertising findById(Long id){return advertisingRepository.findById(id).orElse(null);}
  public Advertising save(Advertising advertising){return advertisingRepository.save(advertising);}
  public boolean exists(Long id){return advertisingRepository.existsById(id);}
  public String findByName(String name){return advertisingRepository.findByName(name);}
  public List<String> findByCompany(String company){return advertisingRepository.findByCompany(company);}
  public List<String> findByProduct(String product){return advertisingRepository.findByProduct(product);}
  public List<Advertising> findByReactionType(EReactionType reactionType){return advertisingRepository.findByReactionType(reactionType);}
  public List<Advertising> findPositiveReactionsByCompany(String company){return advertisingRepository.findPositiveReactionsByCompany(company);}
  public List<Advertising> findByCityWithReactions(String city){return findByCityWithReactions(city);}
  public List<Object[]> findAdvertisingDetailsWithReactions(String name){return advertisingRepository.findAdvertisingDetailsWithReactions(name);}
  public List<Advertising> findByStateWithReactions(String state){return advertisingRepository.findByStateWithReactions(state);}
  public List<Object[]> countReactionsByAdvertising(){return advertisingRepository.countReactionsByAdvertising();}
  public List<Object[]> findAdvertisingWithMostReactionsInCity(String city){return advertisingRepository.findAdvertisingWithMostReactionsInCity(city);}
  public List<Object[]> findAdvertisingWithMostReactionsByType(EReactionType reactionType){return advertisingRepository.findAdvertisingWithMostReactionsByType(reactionType);}
  public List<Object[]> countReactionsByProduct(){return advertisingRepository.countReactionsByProduct();}
  public List<Advertising> findAdvertisingByPainel(Long painelId){return advertisingRepository.findAdvertisingByPainel(painelId);}
  public List<Object[]> countReactionsByAdvertisingAndCity(){return advertisingRepository.countReactionsByAdvertisingAndCity();}
  public List<Advertising> findAdvertisingByProductWithReactionsAboveThreshold(String product, Long threshold){return advertisingRepository.findAdvertisingByProductWithReactionsAboveThreshold(product, threshold);}
  public List<Advertising> findAdvertisingInLocationsWithMorePainels(Byte painelCount){return advertisingRepository.findAdvertisingInLocationsWithMorePainels(painelCount);}
}
