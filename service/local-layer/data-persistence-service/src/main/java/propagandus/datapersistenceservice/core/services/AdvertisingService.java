package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.Advertising;
import propagandus.datapersistenceservice.core.repositorys.AdvertisingRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;
  public Advertising save(Advertising advertising){return advertisingRepository.save(advertising);}
}
