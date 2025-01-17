package propagandus.viewcreationservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.viewcreationservice.core.dtos.ProductPreferencesDTO;

public interface ProductPreferencesView {
  @Query(value = """
    SELECT 
      a.product,
      a.advertising_company,
      COUNT(r.reaction_id) AS total_reactions,
      AVG(r.reaction_scale) AS avg_reaction_scale,
      COUNT(a.attention_id) AS total_attention
    FROM 
      advertising_table a
    LEFT JOIN 
      reaction_table r ON a.advertising_id = r.advertising_id
    LEFT JOIN 
      attention_table t ON a.advertising_id = t.advertising_id
    GROUP BY 
      a.product, a.advertising_company
    """, nativeQuery = true)
  List<ProductPreferencesDTO> productPreferences();
}