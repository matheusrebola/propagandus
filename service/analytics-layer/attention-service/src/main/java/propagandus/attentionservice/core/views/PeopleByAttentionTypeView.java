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
        a.attention,
        SUM(a.people_count) AS total_people
    FROM attention_table a
    GROUP BY a.attention
""")
public record PeopleByAttentionTypeView(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
    String attention,
    Long totalPeople
) {}
