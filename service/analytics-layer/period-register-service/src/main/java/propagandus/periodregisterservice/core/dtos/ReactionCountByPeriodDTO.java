package propagandus.periodregisterservice.core.dtos;

public record ReactionCountByPeriodDTO(
  String periodOfTheDay,
  Integer reactionCount
) {

}
