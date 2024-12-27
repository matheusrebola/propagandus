package propagandus.painelservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import propagandus.painelservice.core.dtos.PainelPerformanceDTO;

public interface PainelPerformanceView {
   @Query(value = """
    SELECT 
        p.painel_id,
        p.identification,
        p.model,
        pt.package_type,
        COUNT(r.reaction_id) AS total_reactions,
        AVG(r.reaction_scale) AS avg_reaction_scale,
        COUNT(a.attention_id) AS total_attention,
        AVG(a.attention_value) AS avg_attention_value
    FROM 
        painel_table p
    LEFT JOIN 
        package_type_table pt ON p.package_type_id = pt.package_type_id
    LEFT JOIN 
        reaction_table r ON p.painel_id = r.painel_id
    LEFT JOIN 
        attention_table a ON p.painel_id = a.painel_id
    GROUP BY 
        p.painel_id;
    """, nativeQuery = true)
    List<PainelPerformanceDTO> painelPerformance();
}
