package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record LocationReactionSummary(
    @Id Long id,
    String city,
    String state,
    String reactionType,
    Long totalReactions
) {}
