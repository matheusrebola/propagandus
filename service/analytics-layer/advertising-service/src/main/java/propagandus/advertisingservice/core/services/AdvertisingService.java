package propagandus.advertisingservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.models.Advertising;
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
}
