package propagandus.advertisingservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import propagandus.advertisingservice.core.documents.ProductPreferences;
import propagandus.advertisingservice.core.dtos.ProductPreferencesDTO;

@Component
public class ProductPreferencesMapper {
  private final ModelMapper modelMapper;
  
  public ProductPreferencesMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

public ProductPreferences map(ProductPreferencesDTO dto){
    ProductPreferences preferences = modelMapper.map(dto, ProductPreferences.class);
    return preferences;
  }
}