package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record PainelsWithAttentionAboveLevel(
  @Id Long id,
  Long painelId,
  Long locationId,
  String identification,
  String model
) {

}
