package propagandus.advertisingservice.core.views;

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
        pr.period_of_the_day,
        COUNT(DISTINCT pr.advertising_id) AS total_advertisings
    FROM date_time_table pr
    GROUP BY pr.period_of_the_day
""")
public record AdvertisingByPeriodView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String periodOfTheDay,
    Long totalAdvertisings
) {}