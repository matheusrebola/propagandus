package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.CampaignEffectiveness;
import propagandus.viewcreationservice.core.dtos.CampaignEffectivenessDTO;

@Component
public class CampaignEffectivenessMapper {
	@Autowired
	private final ModelMapper mapper;

	public CampaignEffectiveness map(CampaignEffectivenessDTO dto) {
		CampaignEffectiveness campaignEffectiveness = mapper.map(dto, CampaignEffectiveness.class);
		return campaignEffectiveness;
	}
	
	public CampaignEffectivenessDTO map(CampaignEffectiveness campaing) {
		CampaignEffectivenessDTO dto = mapper.map(campaing, CampaignEffectivenessDTO.class);
		return dto;
	}
}
