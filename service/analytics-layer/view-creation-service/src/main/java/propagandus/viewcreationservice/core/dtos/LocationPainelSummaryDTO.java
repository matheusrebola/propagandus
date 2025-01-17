package propagandus.viewcreationservice.core.dtos;

import propagandus.viewcreationservice.core.models.enumerators.ECityZone;
import propagandus.viewcreationservice.core.models.enumerators.ELocationType;

public record LocationPainelSummaryDTO(
		Long locationId,
		String streetName,
		String streetNumber,
		String city,
		ECityZone cityZone,
		ELocationType locationType,
		Integer painelId
		) {

}
