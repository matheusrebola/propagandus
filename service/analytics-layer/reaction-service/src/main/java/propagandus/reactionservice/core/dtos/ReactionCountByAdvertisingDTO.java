package propagandus.reactionservice.core.dtos;

public record ReactionCountByAdvertisingDTO(
  String advertisingName,
  Long reactionCount
) {

}
