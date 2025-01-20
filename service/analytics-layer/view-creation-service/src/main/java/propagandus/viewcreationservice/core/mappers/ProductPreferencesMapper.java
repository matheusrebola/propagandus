package propagandus.viewcreationservice.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.ProductPreferences;
import propagandus.viewcreationservice.core.dtos.ProductPreferencesDTO;

@Component
@RequiredArgsConstructor
public class ProductPreferencesMapper {
	private final ModelMapper mapper;

	public ProductPreferences map(ProductPreferencesDTO dto) {
		ProductPreferences preferences = mapper.map(dto, ProductPreferences.class);
		return preferences;
	}
}
