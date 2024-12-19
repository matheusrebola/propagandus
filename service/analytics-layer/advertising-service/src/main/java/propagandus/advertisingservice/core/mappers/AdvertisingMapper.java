package propagandus.advertisingservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.dtos.AdvertisingReactionCountDTO;
import propagandus.advertisingservice.core.models.Advertising;

@Component
@RequiredArgsConstructor
public class AdvertisingMapper {
  private final ModelMapper modelMapper;

  public AdvertisingReactionCountDTO map(Advertising advertising){
    AdvertisingReactionCountDTO dto = modelMapper.map(advertising, AdvertisingReactionCountDTO.class);
    return dto;
  }
}
