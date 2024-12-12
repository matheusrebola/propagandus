package propagandus.advertisingservice.core.views;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Immutable
@Subselect("""
    SELECT 
        a.advertising_id AS id,
        a.advertising_name AS name,
        a.company,
        a.product,
        COUNT(DISTINCT r.reaction_id) AS total_reactions,
        COUNT(DISTINCT pr.period_register_id) AS total_periods
    FROM advertising_table a
    LEFT JOIN reaction_table r ON r.advertising_id = a.advertising_id
    LEFT JOIN date_time_table pr ON pr.advertising_id = a.advertising_id
    GROUP BY a.advertising_id, a.advertising_name, a.company, a.product
""")
public record AdvertisingSummaryView(
  @Id Long id,
  @Column(name = "advertising_name") String advertisingName,
  String company,
  String product,
  Long totalReactions,
  Long totalPeriods
) {
    
}
