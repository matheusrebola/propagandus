package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.ReactionsByLocation;
import propagandus.viewcreationservice.core.dtos.ReactionsByLocationDTO;

@Component
@RequiredArgsConstructor
public class ReactionsByLocationMapper {
	private final ModelMapper mapper;
	
	public ReactionsByLocation map(ReactionsByLocationDTO dto) {
		ReactionsByLocation reaction = mapper.map(dto, ReactionsByLocation.class);
		return reaction;
	}
}
