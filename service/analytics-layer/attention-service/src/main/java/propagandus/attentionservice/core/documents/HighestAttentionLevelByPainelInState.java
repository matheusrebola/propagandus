package propagandus.attentionservice.core.documents;

public record HighestAttentionLevelByPainelInState(
  Long painelId,
  String state,
  Double maxAttention
) {

}
