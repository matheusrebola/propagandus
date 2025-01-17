package propagandus.advertisingservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import propagandus.advertisingservice.core.documents.CampaignEffectiveness;
import propagandus.advertisingservice.core.documents.ProductPreferences;
import propagandus.advertisingservice.core.dtos.CampaignEffectivenessDTO;
import propagandus.advertisingservice.core.dtos.ProductPreferencesDTO;
import propagandus.advertisingservice.core.mappers.CampaignEffectivenessMapper;
import propagandus.advertisingservice.core.mappers.ProductPreferencesMapper;
import propagandus.advertisingservice.core.repositorys.AdvertisingRepository;
import propagandus.advertisingservice.core.repositorys.CampaignEffectivenessRepository;
import propagandus.advertisingservice.core.repositorys.ProductPreferencesRepository;

@Service
public class AdvertisingService {
  private final AdvertisingRepository advertisingRepository;
  private final CampaignEffectivenessRepository campaignEffectivenessRepository;
  private final ProductPreferencesRepository productPreferencesRepository;
  private final CampaignEffectivenessMapper campaignEffectivenessMapper;
  private final ProductPreferencesMapper productPreferencesMapper;
  
  public AdvertisingService(AdvertisingRepository advertisingRepository,
		CampaignEffectivenessRepository campaignEffectivenessRepository,
		ProductPreferencesRepository productPreferencesRepository,
		CampaignEffectivenessMapper campaignEffectivenessMapper, ProductPreferencesMapper productPreferencesMapper) {
	this.advertisingRepository = advertisingRepository;
	this.campaignEffectivenessRepository = campaignEffectivenessRepository;
	this.productPreferencesRepository = productPreferencesRepository;
	this.campaignEffectivenessMapper = campaignEffectivenessMapper;
	this.productPreferencesMapper = productPreferencesMapper;
}

  public List<CampaignEffectiveness> campaignEffectiveness() {
    List<CampaignEffectivenessDTO> dtoList = advertisingRepository.campaignEffectiveness();
    List<CampaignEffectiveness> campaigns = dtoList.stream()
      .map(campaignEffectivenessMapper::map)
      .toList();
    List<CampaignEffectiveness> savedCampaigns = campaignEffectivenessRepository.saveAll(campaigns);
    return savedCampaigns;
  }

  public List<ProductPreferences> productPreferences(){
    List<ProductPreferencesDTO> dtoList = advertisingRepository.productPreferences();
    List<ProductPreferences> products = dtoList.stream()
      .map(productPreferencesMapper::map)
      .toList();
    List<ProductPreferences> savedProducts = productPreferencesRepository.saveAll(products);
    return savedProducts;
  }   
}