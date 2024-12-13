package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ReactionsByProduct(
  @Id Long id,
  String productName,
  Long totalReactions
) {

}
