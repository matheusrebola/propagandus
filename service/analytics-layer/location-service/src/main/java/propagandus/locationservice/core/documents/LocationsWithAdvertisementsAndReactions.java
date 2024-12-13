package propagandus.locationservice.core.documents;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import propagandus.locationservice.core.dtos.PainelDTO;
import propagandus.locationservice.core.dtos.ReactionDTO;

@Document
public record LocationsWithAdvertisementsAndReactions(
  @Id Long id,
  Long locationId,
  String city,
  String state,
  List<PainelDTO> painels,
  List<ReactionDTO> reactions
) {

}
