package propagandus.attentionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record AttentionAvgByPainel(
    @Id Long id,
    String painelIdentification,
    Double avgAttentionLevel,
    Long totalPeople
) {}
