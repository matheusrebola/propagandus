package propagandus.staticregisterservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.staticregisterservice.core.models.Advertising;
import propagandus.staticregisterservice.core.repositorys.AdvertisingRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;
  public Advertising save(Advertising advertising){return advertisingRepository.save(advertising);}
}
