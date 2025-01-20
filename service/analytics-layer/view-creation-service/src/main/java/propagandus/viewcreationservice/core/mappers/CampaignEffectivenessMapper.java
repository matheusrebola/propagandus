package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.CampaignEffectiveness;
import propagandus.viewcreationservice.core.dtos.CampaignEffectivenessDTO;

@Component
@RequiredArgsConstructor
public class CampaignEffectivenessMapper {
	private final ModelMapper mapper;

	public CampaignEffectiveness map(CampaignEffectivenessDTO dto) {
		CampaignEffectiveness campaignEffectiveness = mapper.map(dto, CampaignEffectiveness.class);
		return campaignEffectiveness;
	}
}
