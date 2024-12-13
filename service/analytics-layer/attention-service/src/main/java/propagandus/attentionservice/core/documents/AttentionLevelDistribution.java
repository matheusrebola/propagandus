package propagandus.attentionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record AttentionLevelDistribution(
  @Id Long id,
  Byte attentionLevel,
  Long totalAttentions
) {}
