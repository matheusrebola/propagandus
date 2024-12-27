package propagandus.viewservice.core.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
