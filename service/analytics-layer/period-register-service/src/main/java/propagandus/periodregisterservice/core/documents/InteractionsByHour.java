package propagandus.periodregisterservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record InteractionsByHour(
    @Id Long id,
    Byte hour,
    Long totalInteractions
) {}
