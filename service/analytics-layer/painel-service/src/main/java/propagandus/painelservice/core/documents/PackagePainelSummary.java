package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record PackagePainelSummary(
  String packageType,
  Long totalPainels
) {

}
