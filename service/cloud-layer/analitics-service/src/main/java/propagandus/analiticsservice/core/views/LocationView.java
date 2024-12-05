package propagandus.analiticsservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.analiticsservice.core.models.Painel;

public interface LocationView {
  @Query("SELECT p FROM painel p WHERE p.location.city = :city AND p.name LIKE %:name%")
  List<Painel> findByCityAndNameContaining(@Param("city") String city, @Param("name") String name);
}
