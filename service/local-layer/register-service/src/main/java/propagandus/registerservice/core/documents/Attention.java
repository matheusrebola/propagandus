package propagandus.registerservice.core.documents;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.registerservice.core.enumerators.EAttentionLevel;
import propagandus.registerservice.core.enumerators.ESex;

@Document
public record Attention(
  @Id Integer id,
  EAttentionLevel attentionLevel,
  Byte attentionValue,
  Short lookCount,
  Short peopleCount,
  ESex sex,
  LocalDateTime attentionTime,
  UUID advertisingId,
  Integer painelId
) {

}
