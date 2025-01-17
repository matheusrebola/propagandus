package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import propagandus.viewcreationservice.core.documents.CampaignEffectiveness;
import propagandus.viewcreationservice.core.documents.ProductPreferences;
import propagandus.viewcreationservice.core.dtos.CampaignEffectivenessDTO;
import propagandus.viewcreationservice.core.dtos.ProductPreferencesDTO;
import propagandus.viewcreationservice.core.mappers.CampaignEffectivenessMapper;
import propagandus.viewcreationservice.core.mappers.ProductPreferencesMapper;
import propagandus.viewcreationservice.core.repositorys.AdvertisingRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.CampaignEffectivenessRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.ProductPreferencesRepository;

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