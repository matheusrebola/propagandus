package propagandus.attentionservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.attentionservice.core.dtos.AverageAttentionDTO;
import propagandus.attentionservice.core.dtos.PainelAttentionDTO;
import propagandus.attentionservice.core.dtos.PainelDTO;

public interface AttentionView {
    /*
  // Obter painéis com maior número de atenção registrada em um período específico
@Query("""
    SELECT a.painel, SUM(a.lookCount) AS totalLooks 
    FROM attention a 
    JOIN a.painel p 
    WHERE p.location.city = :city 
    GROUP BY a.painel 
    ORDER BY totalLooks DESC
""")
List<PainelAttentionDTO> findPainelsWithHighestAttentionByCity(@Param("city") String city);

// Buscar painéis que têm mais de X interações de atenção
@Query("""
    SELECT a.painel 
    FROM attention a 
    GROUP BY a.painel 
    HAVING SUM(a.peopleCount) > :threshold
""")
List<PainelDTO> findPainelsWithAttentionAboveThreshold(@Param("threshold") Short threshold);
/*
// Buscar os períodos de maior atenção para um painel específico
@Query("""
    SELECT p.periodOfTheDay, SUM(a.attentionLevel) AS totalAttention 
    FROM attention a 
    JOIN period_register p ON a.painel.id = p.id 
    WHERE a.painel.id = :painelId 
    GROUP BY p.periodOfTheDay 
    ORDER BY totalAttention DESC
""")
List<PainelAttentionPeriodDTO> findPeakAttentionPeriodsByPainel(@Param("painelId") Long painelId);
*/
/*
// Obter painéis com maior atenção em um mês específico
@Query("""
    SELECT a.painel, SUM(a.attentionLevel) AS totalAttention 
    FROM attention a 
    JOIN period_register p ON a.painel.id = p.id 
    WHERE p.month = :month 
    GROUP BY a.painel 
    ORDER BY totalAttention DESC
""")
List<PainelAttentionDTO> findPainelsWithHighestAttentionByMonth(@Param("month") EMonth month);
*/
// Obter a média de atenção por painel em uma localização específica
/*
@Query("""
    SELECT a.painel, AVG(a.attentionLevel) AS avgAttention 
    FROM attention a 
    JOIN a.painel p 
    WHERE p.location.city = :city 
    GROUP BY a.painel
""")
List<AverageAttentionDTO> findAverageAttentionByPainelInCity(@Param("city") String city);
 */
/*
// Buscar painéis com maior número de pessoas interagindo em um período específico
@Query("""
    SELECT a.painel, MAX(a.peopleCount) AS maxPeople 
    FROM attention a 
    JOIN period_register p ON a.painel.id = p.id 
    WHERE p.periodOfTheDay = :period 
    GROUP BY a.painel 
    ORDER BY maxPeople DESC
""")
List<Object[]> findPainelsWithMostPeopleInPeriod(@Param("period") EPeriodOfTheDay period);
*/
// Buscar os níveis de atenção média por cidade
/*

@Query("""
    SELECT p.location.city, AVG(a.attentionLevel) AS avgAttention 
    FROM attention a 
    JOIN a.painel p 
    GROUP BY p.location.city 
    ORDER BY avgAttention DESC
    """)
    List<AverageAttentionDTO> findAverageAttentionByCity();
    
    // Obter os painéis com maior número de olhares registrados
    @Query("""
        SELECT a.painel, SUM(a.lookCount) AS totalLooks 
        FROM attention a 
        GROUP BY a.painel 
        ORDER BY totalLooks DESC
        """)
        List<Object[]> findPainelsWithMostLooks();
        
        */
}
