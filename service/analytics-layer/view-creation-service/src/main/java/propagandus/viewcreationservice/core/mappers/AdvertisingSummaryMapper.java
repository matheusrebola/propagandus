package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.AdvertisingSummary;
import propagandus.viewcreationservice.core.dtos.AdvertisingSummaryDTO;

@Component
@RequiredArgsConstructor
public class AdvertisingSummaryMapper {
	private final ModelMapper mapper;
	
	public AdvertisingSummary map(AdvertisingSummaryDTO dto) {
		AdvertisingSummary advertising = mapper.map(dto, AdvertisingSummary.class);
		return advertising;
	}
	
}
