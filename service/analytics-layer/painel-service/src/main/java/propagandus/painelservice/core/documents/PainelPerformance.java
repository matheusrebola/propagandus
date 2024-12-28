package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record PainelPerformance(
  @Id Long id,
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
