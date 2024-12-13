package propagandus.advertisingservice.core.documents;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.advertisingservice.core.dtos.ReactionDTO;

@Document
public record AdvertisingDetailsWithReactions(
  @Id Long id,
  Long advertisingId,
  String advertisingName,
  String advertisingVersion,
  String company,
  String product,
  List<ReactionDTO> reactions
) {

}
