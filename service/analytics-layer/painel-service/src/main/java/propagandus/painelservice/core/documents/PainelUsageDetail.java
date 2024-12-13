package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record PainelUsageDetail(
  @Id Long id,
  String painelIdentification,
  Long totalAdvertisings,
  Long totalReactions
) {

}
