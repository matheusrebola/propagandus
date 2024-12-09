package propagandus.datapersistenceservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.dtos.AttentionCreateDto;
import propagandus.datapersistenceservice.core.models.Attention;

@Component
@RequiredArgsConstructor
public class AttentionMapper {
  private final ModelMapper modelMapper;

  public Attention map(AttentionCreateDto dto){
    Attention attention = modelMapper.map(dto, Attention.class);
    return attention;
  }
}
