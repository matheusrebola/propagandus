package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ReactionsByAdvertisingAndCity(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  String city,
  Long totalReactions
) {

}
