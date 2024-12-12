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
        l.city,
        COUNT(p.painel_id) AS total_active_painels
    FROM painel_table p
    LEFT JOIN location_table l ON l.location_id = p.location_id
    WHERE p.painel_status = 'ON'
    GROUP BY l.city
""")
public record ActivePainelsByCityView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String city,
    Long totalActivePainels
) {}
