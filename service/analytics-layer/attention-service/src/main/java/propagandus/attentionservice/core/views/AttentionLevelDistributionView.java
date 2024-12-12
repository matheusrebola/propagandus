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
        a.attention_level,
        COUNT(a.attention_id) AS total_attentions
    FROM attention_table a
    GROUP BY a.attention_level
""")
public record AttentionLevelDistributionView(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  Byte attentionLevel,
  Long totalAttentions
) {}
