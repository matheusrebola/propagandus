package propagandus.attentionservice.core.dtos;

public record PainelAttentionStateDTO(
  Long painelId,
  String state,
  Double maxAttention
) {

}
