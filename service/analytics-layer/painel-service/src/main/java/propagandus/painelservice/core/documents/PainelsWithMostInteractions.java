package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.painelservice.core.dtos.PainelDTO;

@Document
public record PainelsWithMostInteractions(
  @Id Long id,
  PainelDTO painel,
  Long interactionCount
) {

}
