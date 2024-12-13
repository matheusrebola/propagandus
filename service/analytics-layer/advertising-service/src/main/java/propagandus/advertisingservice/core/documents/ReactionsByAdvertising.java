package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ReactionsByAdvertising(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  Long totalReactions
) {

}
