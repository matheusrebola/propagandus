package propagandus.locationservice.core.dtos;

public record LocationReactionThresholdDTO(
  Long locationId,
  String city,
  String state,
  String advertisingName,
  Long reactionCount
) {

}
