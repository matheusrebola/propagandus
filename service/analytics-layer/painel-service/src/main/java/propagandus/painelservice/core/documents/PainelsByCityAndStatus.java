package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.painelservice.core.models.enumerators.EStatus;

@Document
public record PainelsByCityAndStatus(
  @Id Long id,
  String city,
  EStatus status,
  Long painelCount
) {

}
