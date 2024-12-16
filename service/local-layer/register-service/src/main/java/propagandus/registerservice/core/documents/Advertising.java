package propagandus.registerservice.core.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Advertising(
  @Id Integer id,
  UUID advertisingId,
  UUID painelId
) {

}
