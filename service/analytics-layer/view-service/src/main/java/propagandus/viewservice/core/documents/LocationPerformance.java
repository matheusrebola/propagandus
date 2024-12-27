package propagandus.viewservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewservice.core.enumerators.ECityZone;
import propagandus.viewservice.core.enumerators.ECityZoneType;
import propagandus.viewservice.core.enumerators.ELocationType;

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
