package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.CampaignEffectiveness;
import propagandus.viewcreationservice.core.dtos.CampaignEffectivenessDTO;

@Component
public class CampaignEffectivenessMapper {
  private final ModelMapper modelMapper;
  
  public CampaignEffectivenessMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

public CampaignEffectiveness map(CampaignEffectivenessDTO dto){
    CampaignEffectiveness campaignEffectiveness = modelMapper.map(dto, CampaignEffectiveness.class);
    return campaignEffectiveness;
  }
}
