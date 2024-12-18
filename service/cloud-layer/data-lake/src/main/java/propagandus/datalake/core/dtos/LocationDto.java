package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.ECityZone;
import propagandus.datalake.core.models.enumerators.ELocationType;

public record LocationDto(
  Long locationId,
  String streetName,
  String streetNumber,
  ELocationType locationType,
  String description,
  String city,
  String state,
  ECityZone cityZone,
  String country,
  Long reactionId,
  Long painelId
) {

}
