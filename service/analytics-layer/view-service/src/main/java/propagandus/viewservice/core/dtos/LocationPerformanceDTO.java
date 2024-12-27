package propagandus.viewservice.core.dtos;

import propagandus.viewservice.core.enumerators.ECityZone;
import propagandus.viewservice.core.enumerators.ECityZoneType;
import propagandus.viewservice.core.enumerators.ELocationType;

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
