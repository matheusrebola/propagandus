package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record CampaignLocationReaction(
    @Id Long id,
    String advertising,
    String city,
    String state,
    Long totalReactions
) {}