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
        COUNT(DISTINCT pr.period_register_id) AS total_records
    FROM date_time_table pr
    GROUP BY pr.day_week
""")
public record ActivityByDayView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String dayWeek,
    Long totalRecords
) {}
