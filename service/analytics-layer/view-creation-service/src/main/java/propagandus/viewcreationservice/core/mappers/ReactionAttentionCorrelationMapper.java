package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.ReactionAttentionCorrelation;
import propagandus.viewcreationservice.core.dtos.ReactionAttentionCorrelationDTO;

@Component
public class ReactionAttentionCorrelationMapper {
	@Autowired
	private final ModelMapper mapper;

	public ReactionAttentionCorrelation map(ReactionAttentionCorrelationDTO dto) {
		ReactionAttentionCorrelation reaction = mapper.map(dto, ReactionAttentionCorrelation.class);
		return reaction;
	}
	
	public ReactionAttentionCorrelationDTO map(ReactionAttentionCorrelation reaction) {
		ReactionAttentionCorrelationDTO dto = mapper.map(reaction, ReactionAttentionCorrelationDTO.class);
		return dto;
	}
}
