package propagandus.painelservice.core.views;

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
        p.painel_id AS id,
        p.identification AS painel_identification,
        COUNT(DISTINCT a.advertising_id) AS total_advertisings,
        COUNT(r.reaction_id) AS total_reactions
    FROM painel_table p
    LEFT JOIN advertising_table a ON a.painel_id = p.painel_id
    LEFT JOIN reaction_table r ON r.painel_id = p.painel_id
    GROUP BY p.painel_id, p.identification
""")
public record PainelUsageDetailView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String painelIdentification,
    Long totalAdvertisings,
    Long totalReactions
) {}
