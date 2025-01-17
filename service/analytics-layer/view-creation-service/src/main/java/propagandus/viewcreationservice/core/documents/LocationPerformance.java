package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.ECityZone;
import propagandus.viewcreationservice.core.models.enumerators.ECityZoneType;
import propagandus.viewcreationservice.core.models.enumerators.ELocationType;

@Document
public record LocationPerformance(
  @Id Long id, 
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
