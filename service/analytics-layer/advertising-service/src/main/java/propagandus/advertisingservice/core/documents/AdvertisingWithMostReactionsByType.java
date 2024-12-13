package propagandus.advertisingservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;

@Document
public record AdvertisingWithMostReactionsByType(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  EReactionType reactionType,
  Long totalReactions
) {

}
