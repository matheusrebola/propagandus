package propagandus.attentionservice.core.documents;

import jakarta.persistence.Id;

public record PainelsWithMostInteractionsAtHour(
  @Id Long id,
  Long painelId,
  String timeFrame, // Hora ou Dia da Semana
  Long totalInteractions
) {

}
