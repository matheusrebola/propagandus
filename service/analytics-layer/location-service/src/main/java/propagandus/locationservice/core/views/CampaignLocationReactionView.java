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
        a.advertising_name AS advertising,
        l.city,
        l.state,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN advertising_table a ON a.advertising_id = r.advertising_id
    LEFT JOIN location_table l ON l.location_id = r.location_id
    GROUP BY a.advertising_name, l.city, l.state
""")
public record CampaignLocationReactionView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String advertising,
    String city,
    String state,
    Long totalReactions
) {}