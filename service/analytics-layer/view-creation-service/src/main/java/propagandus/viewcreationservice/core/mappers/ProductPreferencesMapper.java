package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import propagandus.viewcreationservice.core.documents.ProductPreferences;
import propagandus.viewcreationservice.core.dtos.ProductPreferencesDTO;

@Component
public class ProductPreferencesMapper {
	@Autowired
	private final ModelMapper mapper;

	public ProductPreferences map(ProductPreferencesDTO dto) {
		ProductPreferences preferences = mapper.map(dto, ProductPreferences.class);
		return preferences;
	}
	
	public ProductPreferencesDTO map(ProductPreferences product) {
		ProductPreferencesDTO dto = mapper.map(product, ProductPreferencesDTO.class);
		return dto;
	}
}
