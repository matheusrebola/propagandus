package propagandus.viewservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.CampaignEffectiveness;
import propagandus.viewservice.core.documents.ProductPreferences;
import propagandus.viewservice.core.repositorys.CampaignEffectivenessRepository;
import propagandus.viewservice.core.repositorys.ProductPreferencesRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService {
  private final CampaignEffectivenessRepository campaignEffectivenessRepository;
  private final ProductPreferencesRepository productPreferencesRepository;

  public List<CampaignEffectiveness> campaignEffectiveness() {    
    return campaignEffectivenessRepository.findAll();
  }

  public List<ProductPreferences> productPreferences(){
    return productPreferencesRepository.findAll();
  }   
}
