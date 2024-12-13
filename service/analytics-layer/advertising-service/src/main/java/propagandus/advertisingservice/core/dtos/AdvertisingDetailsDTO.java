package propagandus.advertisingservice.core.dtos;

import java.util.List;

public record AdvertisingDetailsDTO(
  Long advertisingId,
  String advertisingName,
  String advertisingVersion,
  String company,
  String product,
  List<ReactionDTO> reactions
) {

}
