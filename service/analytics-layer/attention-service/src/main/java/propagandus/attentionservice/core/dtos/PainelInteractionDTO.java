package propagandus.attentionservice.core.dtos;

public record PainelInteractionDTO(
  Long painelId,
  String timeFrame, // Hora ou Dia da Semana
  Long totalInteractions
) {

}
