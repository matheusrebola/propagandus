package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.ProductPreferences;
import propagandus.viewcreationservice.core.dtos.ProductPreferencesDTO;

@Component
public class ProductPreferencesMapper {
  private final ModelMapper modelMapper;
  
  public ProductPreferencesMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

public ProductPreferences map(ProductPreferencesDTO dto){
    ProductPreferences preferences = modelMapper.map(dto, ProductPreferences.class);
    return preferences;
  }
}
