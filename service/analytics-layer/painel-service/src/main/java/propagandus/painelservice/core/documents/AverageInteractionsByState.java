package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record AverageInteractionsByState(
  @Id Long id,
  String state,
  Short avgInteractions
) {

}
