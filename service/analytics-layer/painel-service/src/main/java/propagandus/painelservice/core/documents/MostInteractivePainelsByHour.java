package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.painelservice.core.dtos.PainelDTO;

@Document
public record MostInteractivePainelsByHour(
  PainelDTO painel,
  Long totalInteractions
) {

}
