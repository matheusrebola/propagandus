package propagandus.registerservice.core.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.registerservice.core.enumerators.EReactionType;

@Document
public record Reaction(
  @Id Integer id,
  UUID reactionId,
  UUID advertisingId,
  UUID locationId,
  EReactionType reactionType
) {

}
