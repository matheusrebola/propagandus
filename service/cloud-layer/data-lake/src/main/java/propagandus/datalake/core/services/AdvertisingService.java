package propagandus.datalake.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.Advertising;
import propagandus.datalake.core.repositorys.AdvertisingRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;
  public Advertising save(Advertising advertising){return advertisingRepository.save(advertising);}
}
