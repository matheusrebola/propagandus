package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.AttentionReport;
import propagandus.viewcreationservice.core.dtos.AttentionReportDTO;

@Component
@RequiredArgsConstructor
public class AttentionReportMapper {
	private final ModelMapper mapper;
	
	public AttentionReport map(AttentionReportDTO dto) {
		AttentionReport attention = mapper.map(dto, AttentionReport.class);
		return attention;
	}
}
