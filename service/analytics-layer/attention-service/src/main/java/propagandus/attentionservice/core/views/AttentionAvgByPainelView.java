package propagandus.attentionservice.core.views;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Immutable
@Subselect("""
    SELECT 
        p.painel_id AS id,
        p.identification AS painel_identification,
        AVG(a.attention_level) AS avg_attention_level,
        SUM(a.people_count) AS total_people
    FROM painel_table p
    LEFT JOIN attention_table a ON a.painel_id = p.painel_id
    GROUP BY p.painel_id, p.identification
""")
public record AttentionAvgByPainelView(
    @Id Long id,
    String painelIdentification,
    Double avgAttentionLevel,
    Long totalPeople
) {}
