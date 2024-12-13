package propagandus.periodregisterservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ActivityByDay(
    @Id Long id,
    String dayWeek,
    Long totalRecords
) {}
