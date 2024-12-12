package propagandus.attentionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record PeopleByAttentionType(
    @Id Long id,
    String attention,
    Long totalPeople
) {}
