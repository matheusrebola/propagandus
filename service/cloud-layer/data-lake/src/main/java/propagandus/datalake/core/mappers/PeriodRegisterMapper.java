package propagandus.datalake.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.dtos.PeriodRegisterCreateDto;
import propagandus.datalake.core.dtos.PeriodRegisterDto;
import propagandus.datalake.core.models.PeriodRegister;

@Component
@RequiredArgsConstructor
public class PeriodRegisterMapper {
	private ModelMapper mapper;
	
	public PeriodRegister map(PeriodRegisterCreateDto dto) {
		PeriodRegister register = mapper.map(dto, PeriodRegister.class);
		return register;
	}
	
	public PeriodRegisterDto map(PeriodRegister register) {
		PeriodRegisterDto dto = mapper.map(register, PeriodRegisterDto.class);
		return dto;
	}
}
