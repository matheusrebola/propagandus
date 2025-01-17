package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.AdvertisingSummary;
import propagandus.viewcreationservice.core.dtos.AdvertisingSummaryDTO;

@Component
public class AdvertisingSummaryMapper {
	@Autowired
	private final ModelMapper mapper;
	
	public AdvertisingSummary map(AdvertisingSummaryDTO dto) {
		AdvertisingSummary advertising = mapper.map(dto, AdvertisingSummary.class);
		return advertising;
	}
	
	public AdvertisingSummaryDTO map(AdvertisingSummary advertising) {
		AdvertisingSummaryDTO dto = mapper.map(advertising, AdvertisingSummaryDTO.class);
		return dto;
	}
}
