package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.AdvertisingSummary;
import propagandus.viewcreationservice.core.documents.CampaignEffectiveness;
import propagandus.viewcreationservice.core.documents.ProductPreferences;
import propagandus.viewcreationservice.core.dtos.AdvertisingSummaryDTO;
import propagandus.viewcreationservice.core.dtos.CampaignEffectivenessDTO;
import propagandus.viewcreationservice.core.dtos.ProductPreferencesDTO;
import propagandus.viewcreationservice.core.mappers.AdvertisingSummaryMapper;
import propagandus.viewcreationservice.core.mappers.CampaignEffectivenessMapper;
import propagandus.viewcreationservice.core.mappers.ProductPreferencesMapper;
import propagandus.viewcreationservice.core.repositorys.AdvertisingRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.AdvertisingSummaryRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.CampaignEffectivenessRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.ProductPreferencesRepository;

@Service
@RequiredArgsConstructor
public class AdvertisingService extends AViewCreationService {
	
	private final AdvertisingRepository advertisingRepository;
	
	private final CampaignEffectivenessRepository campaignEffectivenessRepository;
	private final ProductPreferencesRepository productPreferencesRepository;
	private final AdvertisingSummaryRepository advertisingSummaryRepository;
	
	private final CampaignEffectivenessMapper campaignEffectivenessMapper;
	private final ProductPreferencesMapper productPreferencesMapper;
	private final AdvertisingSummaryMapper advertisingSummaryMapper;

	@Override
	protected void executeProcess() {
		campaignEffectiveness();
		productPreferences();
		advertisingSummary();		
	}

	public void campaignEffectiveness(){
		List<CampaignEffectivenessDTO> dtoList = advertisingRepository.campaignEffectiveness();
		List<CampaignEffectiveness> campaigns = dtoList.stream()
				.map(campaignEffectivenessMapper::map)
				.toList();
		campaignEffectivenessRepository.saveAll(campaigns);		
	}

	public void productPreferences(){
		List<ProductPreferencesDTO> dtoList = advertisingRepository.productPreferences();
		List<ProductPreferences> products = dtoList.stream()
				.map(productPreferencesMapper::map)
				.toList();
		productPreferencesRepository.saveAll(products);
	}
	
	public void advertisingSummary() {
		List<AdvertisingSummaryDTO> dtoList = advertisingRepository.advertisingSummary();
		List<AdvertisingSummary> advertisings = dtoList.stream()
				.map(advertisingSummaryMapper::map)
				.toList();
		advertisingSummaryRepository.saveAll(advertisings);
	}

	@Override
	public void clearDatabase() {
		// TODO Auto-generated method stub
		
	}

}