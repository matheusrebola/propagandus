package propagandus.analyticsservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analyticsservice.core.models.Advertising;
import propagandus.analyticsservice.core.repositorys.AdvertisingRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;

  public List<Advertising> findAll(){return advertisingRepository.findAll();}
  public Advertising findById(Long id){return advertisingRepository.findById(id).orElse(null);}
  public Advertising save(Advertising advertising){return advertisingRepository.save(advertising);}
  public boolean exists(Long id){return advertisingRepository.existsById(id);}

}
