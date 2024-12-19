package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record PainelsByCityAndStatus(
  @Id Long id,
  String city,
  Long painelCount
) {

}
