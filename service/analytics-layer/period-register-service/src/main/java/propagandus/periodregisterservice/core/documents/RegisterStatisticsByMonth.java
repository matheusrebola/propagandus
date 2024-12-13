package propagandus.periodregisterservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record RegisterStatisticsByMonth(
    @Id Long id,
    String month,
    Long totalRegisters
) {}
