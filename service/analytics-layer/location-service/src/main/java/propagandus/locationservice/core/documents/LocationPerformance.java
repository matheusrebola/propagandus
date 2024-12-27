package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.locationservice.core.models.enumerators.ECityZone;
import propagandus.locationservice.core.models.enumerators.ECityZoneType;
import propagandus.locationservice.core.models.enumerators.ELocationType;

@Document
public record LocationPerformance(
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
