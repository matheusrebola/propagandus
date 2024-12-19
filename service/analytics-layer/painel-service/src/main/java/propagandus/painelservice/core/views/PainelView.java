package propagandus.painelservice.core.views;

public interface PainelView {
/*
// Buscar todos os painéis ativos em uma cidade específica
@Query("""
    SELECT p 
    FROM Painel p 
    WHERE p.status = 'ACTIVE' AND p.location.city = :city
""")
List<Painel> findActivePainelsByCity(@Param("city") String city);
*/
/*
// Contar interações por status do painel em uma cidade específica
@Query("""
    SELECT p.status, COUNT(a) AS interactionCount 
    FROM Attention a 
    JOIN a.painel p 
    WHERE p.location.city = :city 
    GROUP BY p.status
""")
List<Object[]> countInteractionsByPainelStatusInCity(@Param("city") String city);
*/
/*
// Listar os painéis ativos por modelo
@Query("""
    SELECT p 
    FROM Painel p 
    WHERE p.status = 'ACTIVE' 
    ORDER BY p.model
""")
List<Painel> findActivePainelsByModel();
*/
/*
// Obter os painéis que nunca registraram atenção
@Query("""
    SELECT p 
    FROM Painel p 
    WHERE NOT EXISTS (
        SELECT 1 
        FROM Attention a 
        WHERE a.painel.id = p.id
    )
""")
List<Painel> findPainelsWithNoAttention();
*/
/*
// Contar painéis por estado
@Query("""
  SELECT p.location.state, COUNT(p) 
  FROM Painel p 
  GROUP BY p.location.state
  """)
  List<Object[]> countPainelsByState();
 */
/* 

// Obter os painéis com maior número de interações registradas
@Query("""
  SELECT a.painel, COUNT(a) AS interactionCount 
  FROM Attention a 
  GROUP BY a.painel 
  ORDER BY interactionCount DESC
  """)
  List<Object[]> findPainelsWithMostInteractions();
*/
/*  
// Listar painéis por cidade e status
@Query("""
    SELECT p 
    FROM Painel p 
    WHERE p.location.city = :city
""")
List<Painel> findPainelsByCityAndStatus(@Param("city") String city);
*/
/*
// Buscar painéis que registraram atenção acima de um determinado nível
@Query("""
    SELECT a.painel 
    FROM Attention a 
    GROUP BY a.painel 
    HAVING AVG(a.attentionLevel) > :threshold
""")
List<Painel> findPainelsWithAttentionAboveLevel(@Param("threshold") Double threshold);
*/

/*
// Listar os modelos de painel com maior número de pessoas registradas
@Query("""
    SELECT p.model, SUM(a.peopleCount) AS totalPeople 
    FROM Attention a 
    JOIN a.painel p 
    GROUP BY p.model 
    ORDER BY totalPeople DESC
""")
List<Object[]> findPainelModelsWithMostPeople();
*/

/*
// Contar os painéis por modelo em um estado específico
@Query("""
    SELECT p.model, COUNT(p) 
    FROM Painel p 
    WHERE p.location.state = :state 
    GROUP BY p.model
""")
List<Object[]> countPainelsByModelInState(@Param("state") String state);
*/
/*
// Calcular a média de interações por painel por estado
@Query("""
    SELECT p.location.state, AVG(a.attentionLevel) AS avgAttention 
    FROM Attention a 
    JOIN a.painel p 
    GROUP BY p.location.state
""")
List<Object[]> calculateAverageInteractionsByState();
*/
/*
// Listar painéis mais interativos por hora
@Query("""
    SELECT p, pHour.hour, MAX(a.attentionLevel) AS maxAttention 
    FROM Attention a 
    JOIN a.painel p 
    JOIN PeriodRegister pHour ON a.painel.id = pHour.painel.id 
    GROUP BY p, pHour.hour 
    ORDER BY maxAttention DESC
""")
List<Object[]> findMostInteractivePainelsByHour();
*/
}
