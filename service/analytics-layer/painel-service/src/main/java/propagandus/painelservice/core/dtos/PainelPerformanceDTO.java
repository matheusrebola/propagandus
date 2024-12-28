package propagandus.painelservice.core.dtos;

public record PainelPerformanceDTO(
  Long painelId,
  String identification,
  String model,
  Byte packageType,
  Integer totalReactions,
  Byte avgReactionScale,
  Integer totalAttention,
  Byte avgAttentionValue
) {

}
