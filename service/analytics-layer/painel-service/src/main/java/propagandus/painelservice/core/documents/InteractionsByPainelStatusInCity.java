package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record InteractionsByPainelStatusInCity(
  @Id Long id,
  Long interactionCount
) {

}
