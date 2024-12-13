package propagandus.attentionservice.core.dtos;

public record AttentionLevelDTO(
  String category, // Pode ser modelo ou estado
  Double maxAttention
) {

}
