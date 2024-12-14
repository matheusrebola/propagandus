package propagandus.registerservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Attention(
  @Id Long id
) {

}
