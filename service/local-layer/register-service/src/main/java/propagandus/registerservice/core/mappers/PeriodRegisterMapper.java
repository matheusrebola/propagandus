package propagandus.registerservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.PeriodRegister;
import propagandus.registerservice.core.dtos.PeriodRegisterCreateDTO;
import propagandus.registerservice.core.dtos.PeriodRegisterDTO;

@Component
@RequiredArgsConstructor
public class PeriodRegisterMapper {
  private final ModelMapper modelMapper;

  public PeriodRegister map(PeriodRegisterCreateDTO dto){
    PeriodRegister periodRegister = modelMapper.map(dto, PeriodRegister.class);
    return periodRegister;
  }
  public PeriodRegisterDTO map(PeriodRegister periodRegister){
    PeriodRegisterDTO dto = modelMapper.map(periodRegister, PeriodRegisterDTO.class);
    return dto;
  }
}
