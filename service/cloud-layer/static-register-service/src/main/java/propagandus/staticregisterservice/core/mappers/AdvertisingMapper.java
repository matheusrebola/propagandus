package propagandus.staticregisterservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.staticregisterservice.core.dtos.AdvertisingCreateDto;
import propagandus.staticregisterservice.core.dtos.AdvertisingDto;
import propagandus.staticregisterservice.core.models.Advertising;

@Component
@RequiredArgsConstructor
public class AdvertisingMapper {
  private final ModelMapper modelMapper;

  public Advertising map(AdvertisingCreateDto dto){
    Advertising advertising = modelMapper.map(dto, Advertising.class);
    return advertising;
  }

  public AdvertisingDto map(Advertising advertising){
    AdvertisingDto dto = modelMapper.map(advertising, AdvertisingDto.class);
    return dto;
  }
}
