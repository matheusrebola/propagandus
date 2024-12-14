package propagandus.registerservice.core.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.registerservice.core.enumerators.EAttentionLevel;

@Document
public record Attention(
  @Id Integer id,
  UUID painelId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount
) {

}
