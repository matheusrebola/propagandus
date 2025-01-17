package propagandus.viewcreationservice.core.dtos;

import propagandus.viewcreationservice.core.models.enumerators.ECityZone;
import propagandus.viewcreationservice.core.models.enumerators.ECityZoneType;
import propagandus.viewcreationservice.core.models.enumerators.ELocationType;

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
