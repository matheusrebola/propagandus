package propagandus.reactionservice.core.views;

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
        l.location_type,
        r.reaction_type,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN location_table l ON l.location_id = r.location_id
    GROUP BY l.location_type, r.reaction_type
""")
public record ReactionByLocationType(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String locationType,
    String reactionType,
    Long totalReactions
) {}
