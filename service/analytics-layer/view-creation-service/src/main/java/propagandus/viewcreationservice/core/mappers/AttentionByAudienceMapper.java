package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.AttentionByAudience;
import propagandus.viewcreationservice.core.dtos.AttentionByAudienceDTO;

@Component
@RequiredArgsConstructor
public class AttentionByAudienceMapper {
	private final ModelMapper mapper;

	public AttentionByAudience map(AttentionByAudienceDTO dto) {
		AttentionByAudience attentionByAudience = mapper.map(dto, AttentionByAudience.class);
		return attentionByAudience;
	}
}