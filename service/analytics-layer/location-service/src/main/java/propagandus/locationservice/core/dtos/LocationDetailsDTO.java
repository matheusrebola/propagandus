package propagandus.locationservice.core.dtos;

import java.util.List;

public record LocationDetailsDTO(
  Long locationId,
  String city,
  String state,
  List<PainelDTO> painels,
  List<ReactionDTO> reactions
) {

}
