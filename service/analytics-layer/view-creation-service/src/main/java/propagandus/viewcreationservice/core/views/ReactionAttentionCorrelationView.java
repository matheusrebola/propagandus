package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.ReactionAttentionCorrelationDTO;

public interface ReactionAttentionCorrelationView {
  @Query(value = """
    SELECT 
      r.reaction_type,
      r.reaction_scale,
      a.attention_level,
      AVG(a.attention_value) AS avg_attention_value,
      SUM(a.look_count) AS total_looks,
      SUM(a.people_count) AS total_people
    FROM 
      reaction_table r
    JOIN 
      attention_table a ON r.advertising_id = a.advertising_id AND r.painel_id = a.painel_id
    GROUP BY 
      r.reaction_type, r.reaction_scale, a.attention_level
    """, nativeQuery = true)
  List<ReactionAttentionCorrelationDTO> reactionAttentionCorrelation();

}