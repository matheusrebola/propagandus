package propagandus.registerservice.core.documents;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.registerservice.core.enumerators.EAttentionLevel;
import propagandus.registerservice.core.enumerators.ESex;

@Document
public record Attention(
  @Id Integer id,
  UUID painelId,
  UUID advertisingId,
  Integer periodRegisterId,
  EAttentionLevel attention,
  Byte attentionLevel,
  Short lookCount,
  Short peopleCount,
  ESex sex
) {

}
