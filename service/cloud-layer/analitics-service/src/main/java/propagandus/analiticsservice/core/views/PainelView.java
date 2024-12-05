package propagandus.analiticsservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.analiticsservice.core.models.Painel;

public interface PainelView {
  //Buscar todos os painéis ativos em uma cidade específica
  @Query("SELECT p FROM painel p WHERE p.location.city = :city AND p.status = 'ACTIVE'")
  List<Painel> findActivePainelsByCity(@Param("city") String city);

  //Contar interações por status do painel em uma cidade específica
  @Query("SELECT p.status, COUNT(a) FROM painel p JOIN attention a ON p.id = a.painel.id WHERE p.location.city = :city GROUP BY p.status")
  List<Object[]> countInteractionsByPainelStatusInCity(@Param("city") String city);
}
