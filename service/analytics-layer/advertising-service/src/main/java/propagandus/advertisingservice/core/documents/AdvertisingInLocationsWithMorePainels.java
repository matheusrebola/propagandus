package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record AdvertisingInLocationsWithMorePainels(
  @Id Long id,
  Long advertisingId,
  String name,
  String version,
  String company,
  String product,
  Long reactionId,
  Long periodRegisterId,
  Long painelId
) {

}
