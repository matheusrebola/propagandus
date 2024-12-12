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
        p.painel_status AS status,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN painel_table p ON p.painel_id = r.painel_id
    GROUP BY p.painel_status
""")
public record ReactionByPainelStatus(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String status,
    Long totalReactions
) {}
