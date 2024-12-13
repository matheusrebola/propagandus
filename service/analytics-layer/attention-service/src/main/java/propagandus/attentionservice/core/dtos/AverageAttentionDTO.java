package propagandus.attentionservice.core.dtos;

public record AverageAttentionDTO(
  Long painelId,
  String location,
  Double avgAttention
) {

}
