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
        pr.month,
        COUNT(pr.period_register_id) AS total_registers
    FROM date_time_table pr
    GROUP BY pr.month
""")
public record RegisterStatisticsByMonthView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String month,
    Long totalRegisters
) {}
