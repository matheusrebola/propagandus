package propagandus.viewcreationservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record ProductPreferences(
  @Id Long id,
  Long productId,
  String advertisingCompany,
  Integer totalReactions,
  Byte avgReactionScale,
  Short totalAttention
){}