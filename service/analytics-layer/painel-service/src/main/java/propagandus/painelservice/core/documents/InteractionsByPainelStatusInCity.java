package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.painelservice.core.models.enumerators.EStatus;

@Document
public record InteractionsByPainelStatusInCity(
  @Id Long id,
  EStatus status,
  Long interactionCount
) {

}
