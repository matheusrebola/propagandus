package propagandus.advertisingservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.documents.ProductPreferences;
import propagandus.advertisingservice.core.dtos.ProductPreferencesDTO;

@Component
@RequiredArgsConstructor
public class ProductPreferencesMapper {
  ModelMapper modelMapper;

  public ProductPreferences map(ProductPreferencesDTO dto){
    ProductPreferences preferences = modelMapper.map(dto, ProductPreferences.class);
    return preferences;
  }
}
