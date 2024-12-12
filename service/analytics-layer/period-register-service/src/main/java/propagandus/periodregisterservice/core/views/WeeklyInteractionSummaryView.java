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
        pr.day_week,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN date_time_table pr ON pr.period_register_id = r.period_time_id
    GROUP BY pr.day_week
""")
public record WeeklyInteractionSummaryView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String dayWeek,
    Long totalReactions
) {}
