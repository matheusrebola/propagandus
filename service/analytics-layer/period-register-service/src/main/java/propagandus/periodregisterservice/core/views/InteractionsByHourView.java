package propagandus.periodregisterservice.core.views;

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
        pr.hour,
        COUNT(r.reaction_id) AS total_interactions
    FROM reaction_table r
    LEFT JOIN date_time_table pr ON pr.period_register_id = r.period_time_id
    GROUP BY pr.hour
""")
public record InteractionsByHourView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    Byte hour,
    Long totalInteractions
) {}
