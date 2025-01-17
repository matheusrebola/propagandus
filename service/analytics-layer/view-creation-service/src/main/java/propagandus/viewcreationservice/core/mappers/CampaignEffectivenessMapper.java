package propagandus.advertisingservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import propagandus.advertisingservice.core.documents.CampaignEffectiveness;
import propagandus.advertisingservice.core.dtos.CampaignEffectivenessDTO;

@Component
public class CampaignEffectivenessMapper {
  private final ModelMapper modelMapper;
  
  public CampaignEffectivenessMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

public CampaignEffectiveness map(CampaignEffectivenessDTO dto){
    CampaignEffectiveness campaignEffectiveness = modelMapper.map(dto, CampaignEffectiveness.class);
    return campaignEffectiveness;
  }
}
