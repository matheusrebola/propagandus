package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ProductPreferences(
  @Id Long id,
  Long productId,
  String advertisingCompany,
  Integer totalReactions,
  Byte avgReactionScale,
  Short totalAttention
){}