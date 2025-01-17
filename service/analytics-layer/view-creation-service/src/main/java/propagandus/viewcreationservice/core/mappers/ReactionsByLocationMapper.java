package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.ReactionsByLocation;
import propagandus.viewcreationservice.core.dtos.ReactionsByLocationDTO;

@Component
public class ReactionsByLocationMapper {
	@Autowired
	private final ModelMapper mapper;
	
	public ReactionsByLocation map(ReactionsByLocationDTO dto) {
		ReactionsByLocation reaction = mapper.map(dto, ReactionsByLocation.class);
		return reaction;
	}
	
	public ReactionsByLocationDTO map(ReactionsByLocation reaction) {
		ReactionsByLocationDTO dto = mapper.map(reaction, ReactionsByLocationDTO.class);
		return dto;
	}

}
