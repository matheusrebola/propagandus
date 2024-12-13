package propagandus.painelservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import propagandus.painelservice.core.models.Painel;
import propagandus.painelservice.core.models.enumerators.EStatus;

@Repository
public interface PainelRepository extends JpaRepository<Painel, Long> {
  String findByIdentification(String identification);
  List<EStatus> findByStatus(EStatus status);
  List<String> findByModel(String model);

  //Buscar todos os painéis ativos em uma cidade específica
  @Query("SELECT p FROM painel p WHERE p.location.city = :city AND p.status = 'ACTIVE'")
  List<Painel> findActivePainelsByCity(@Param("city") String city);

  //Contar interações por status do painel em uma cidade específica
  @Query("SELECT p.status, COUNT(a) FROM painel p JOIN attention a ON p.id = a.painel.id WHERE p.location.city = :city GROUP BY p.status")
  List<Object[]> countInteractionsByPainelStatusInCity(@Param("city") String city);

  //Listar os painéis ativos por modelo
  @Query("SELECT p.model, COUNT(p) AS activeCount FROM painel p WHERE p.status = 'ACTIVE' GROUP BY p.model ORDER BY activeCount DESC")
  List<Object[]> findActivePainelsByModel();

  //Obter os painéis que nunca registraram atenção
  @Query("SELECT p FROM painel p LEFT JOIN attention a ON p.id = a.painel.id WHERE a.id IS NULL")
  List<Painel> findPainelsWithNoAttention();

  //Buscar painéis por status e cidade
  @Query("SELECT p FROM painel p WHERE p.status = :status AND p.location.city = :city")
  List<Painel> findByStatusAndCity(@Param("status") EStatus status, @Param("city") String city);

  //Contar painéis por estado
  @Query("SELECT p.location.state, COUNT(p) AS painelCount FROM painel p GROUP BY p.location.state ORDER BY painelCount DESC")
  List<Object[]> countPainelsByState();

  //Obter os painéis com maior número de interações registradas
  @Query("SELECT p, COUNT(a) AS interactionCount FROM painel p JOIN attention a ON p.id = a.painel.id GROUP BY p ORDER BY interactionCount DESC")
  List<Object[]> findPainelsWithMostInteractions();

  //Listar painéis por cidade e status
  @Query("SELECT p.location.city, p.status, COUNT(p) AS painelCount FROM painel p GROUP BY p.location.city, p.status ORDER BY painelCount DESC")
  List<Object[]> countPainelsByCityAndStatus();

  //Buscar painéis que registraram atenção acima de um determinado nível
  @Query("SELECT p FROM painel p JOIN attention a ON p.id = a.painel.id WHERE a.attentionLevel > :level")
  List<Painel> findPainelsWithAttentionAboveLevel(@Param("level") Byte level);

  //Listar os modelos de painel com maior número de pessoas registradas
  @Query("SELECT p.model, SUM(a.peopleCount) AS totalPeople FROM painel p JOIN attention a ON p.id = a.painel.id GROUP BY p.model ORDER BY totalPeople DESC")
  List<Object[]> findModelsWithMostPeopleRegistered();

  //Contar os painéis por modelo em um estado específico
  @Query("SELECT p.model, COUNT(p) AS painelCount FROM painel p WHERE p.location.state = :state GROUP BY p.model ORDER BY painelCount DESC")
  List<Object[]> countPainelsByModelInState(@Param("state") String state);

  //Calcular a média de interações por painel por estado
  @Query("SELECT p.location.state, AVG(a.lookCount) AS avgInteractions FROM painel p JOIN attention a ON p.id = a.painel.id GROUP BY p.location.state ORDER BY avgInteractions DESC")
  List<Object[]> findAverageInteractionsByState();

  //Listar painéis mais interativos por hora
  @Query("SELECT p, SUM(a.lookCount) AS totalInteractions FROM painel p JOIN attention a ON p.id = a.painel.id JOIN period_register pr ON pr.id = a.id WHERE pr.hour = :hour GROUP BY p ORDER BY totalInteractions DESC")
  List<Object[]> findMostInteractivePainelsByHour(@Param("hour") Byte hour);

  /*@Query("""
    SELECT 
        l.city,
        COUNT(p.painel_id) AS total_active_painels
    FROM painel_table p
    LEFT JOIN location_table l ON l.location_id = p.location_id
    WHERE p.painel_status = 'ON'
    GROUP BY l.city
""") */
  /*@Query("""
    SELECT 
        pt.package_type,
        COUNT(p.painel_id) AS total_painels
    FROM package_type_table pt
    LEFT JOIN painel_table p ON p.package_type_id = pt.package_type_id
    GROUP BY pt.package_type
""") */
  /*@Query"""
    SELECT 
        p.painel_id AS id,
        p.identification AS painel_identification,
        COUNT(DISTINCT a.advertising_id) AS total_advertisings,
        COUNT(r.reaction_id) AS total_reactions
    FROM painel_table p
    LEFT JOIN advertising_table a ON a.painel_id = p.painel_id
    LEFT JOIN reaction_table r ON r.painel_id = p.painel_id
    GROUP BY p.painel_id, p.identification
""" */
}
