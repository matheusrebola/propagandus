package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ReactionsByState(
  @Id Long id,
  String location, // Pode ser cidade ou estado
  Long count
) {

}
