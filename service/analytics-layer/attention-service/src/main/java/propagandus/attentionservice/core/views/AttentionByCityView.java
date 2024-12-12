package propagandus.attentionservice.core.views;

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
        AVG(a.attention_level) AS avg_attention_level,
        SUM(a.people_count) AS total_people
    FROM attention_table a
    LEFT JOIN painel_table p ON p.painel_id = a.painel_id
    LEFT JOIN location_table l ON l.location_id = p.location_id
    GROUP BY l.city
""")
public record AttentionByCityView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String city,
    Double avgAttentionLevel,
    Long totalPeople
) {}
