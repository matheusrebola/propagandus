package propagandus.attentionservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AttentionMapper {
  private final ModelMapper modelMapper;

}