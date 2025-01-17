package propagandus.locationservice.core.dtos;

import propagandus.locationservice.core.models.enumerators.ECityZone;
import propagandus.locationservice.core.models.enumerators.ECityZoneType;
import propagandus.locationservice.core.models.enumerators.ELocationType;

public record LocationPerformanceDTO(
  Long locationId,
  String streetName,
  ELocationType locationType,
  String number,
  String city,
  ECityZone cityZone,
  ECityZoneType cityZoneType,
  Long totalReactions,
  Short avgReactionScale,
  Integer totalAttention
) {

}
