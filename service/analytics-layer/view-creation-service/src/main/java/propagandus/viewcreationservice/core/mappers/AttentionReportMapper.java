package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.AttentionReport;
import propagandus.viewcreationservice.core.dtos.AttentionReportDTO;

@Component
public class AttentionReportMapper {
	@Autowired
	private final ModelMapper mapper;
	
	public AttentionReport map(AttentionReportDTO dto) {
		AttentionReport attention = mapper.map(dto, AttentionReport.class);
		return attention;
	}
	
	public AttentionReportDTO map(AttentionReport attention) {
		AttentionReportDTO dto = mapper.map(attention, AttentionReportDTO.class);
		return dto;
	}
}
