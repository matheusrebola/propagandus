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
        a.advertising_name AS advertising,
        AVG(r.reaction_type) AS avg_reaction_type
    FROM reaction_table r
    LEFT JOIN advertising_table a ON a.advertising_id = r.advertising_id
    GROUP BY a.advertising_name
""")
public record AverageReactionByCampaign(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String advertising,
    Double avgReactionType
) {}