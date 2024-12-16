package propagandus.registerservice.core.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Painel(
  @Id Integer id,
  UUID painelId,
  UUID packageTypeId,
  UUID locationId
) {

}
