package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.AttentionByAudience;
import propagandus.viewcreationservice.core.dtos.AttentionByAudienceDTO;

@Component
public class AttentionByAudienceMapper {
	@Autowired
	private final ModelMapper mapper;

	public AttentionByAudience map(AttentionByAudienceDTO dto) {
		AttentionByAudience attentionByAudience = mapper.map(dto, AttentionByAudience.class);
		return attentionByAudience;
	}

	public AttentionByAudienceDTO map(AttentionByAudience attention) {
		AttentionByAudienceDTO dto = mapper.map(attention, AttentionByAudienceDTO.class);
		return dto;
	}
}