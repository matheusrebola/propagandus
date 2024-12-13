package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record AdvertisingWithMostReactionsInCity(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  String city,
  Long totalReactions
) {

}
