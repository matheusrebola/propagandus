package propagandus.painelservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.painelservice.core.models.Painel;
import propagandus.painelservice.core.models.enumerators.EStatus;

public interface PainelView {
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

  //Buscar painéis de um modelo específico com status ativo
  @Query("SELECT p FROM painel p WHERE p.model = :model AND p.status = 'ACTIVE'")
  List<Painel> findActivePainelsByModel(@Param("model") String model);

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
}
