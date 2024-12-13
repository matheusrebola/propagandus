package propagandus.attentionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record AttentionByCity(
    @Id Long id,
    String city,
    Double avgAttentionLevel,
    Long totalPeople
) {}
