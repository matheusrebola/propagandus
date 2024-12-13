package propagandus.reactionservice.core.dtos;

public record ReactionCountByPainelAndPeriodDTO(
  String city,
  String periodOfTheDay,
  Long reactionCount
) {

}
