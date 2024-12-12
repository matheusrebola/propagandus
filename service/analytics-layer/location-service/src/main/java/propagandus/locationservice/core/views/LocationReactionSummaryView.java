package propagandus.locationservice.core.views;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Immutable
@Subselect("""
    SELECT 
        l.location_id AS id,
        l.city,
        l.state,
        r.reaction_type,
        COUNT(r.reaction_id) AS total_reactions
    FROM location_table l
    LEFT JOIN reaction_table r ON r.location_id = l.location_id
    GROUP BY l.location_id, l.city, l.state, r.reaction_type
""")
public record LocationReactionSummaryView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String city,
    String state,
    String reactionType,
    Long totalReactions
) {}
