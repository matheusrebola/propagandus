package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.ECityZone;
import propagandus.viewcreationservice.core.models.enumerators.ELocationType;

@Document
public record LocationPainelSummary(
		@Id Long id,
		Long locationId,
		String streetName,
		String streetNumber,
		String city,
		ECityZone cityZone,
		ELocationType locationType,
		Integer painelId
		) {

}
