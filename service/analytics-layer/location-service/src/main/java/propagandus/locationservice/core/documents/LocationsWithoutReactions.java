package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record LocationsWithoutReactions(
  @Id Long id,
  Long locationId,
  String zipCode,
  String publicPlace,
  String number,
  String city,
  String state,
  String country,
  Long reactionId,
  Long painelId
) {

}
