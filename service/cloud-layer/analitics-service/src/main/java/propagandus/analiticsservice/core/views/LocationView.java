package propagandus.analiticsservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.analiticsservice.core.models.Location;

public interface LocationView {
  //Listar locais com o maior número de reações
  @Query("SELECT l.city, COUNT(r) FROM location l JOIN l.reactions r GROUP BY l.city ORDER BY COUNT(r) DESC")
  List<Object[]> findLocationsWithMostReactions();

  //Listar todas as localizações com propagandas associadas
  @Query("SELECT DISTINCT l FROM location l JOIN l.paineis p WHERE p IS NOT NULL")
  List<Location> findLocationsWithAdvertisements();

  //Buscar todas as localizações em uma cidade específica com reações positivas
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r WHERE l.city = :city AND r.reactionType = 'POSITIVE'")
  List<Location> findLocationsByCityWithPositiveReactions(@Param("city") String city);

  //Listar todas as localizações que possuem reações associadas
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r WHERE r IS NOT NULL")
  List<Location> findLocationsWithReactions();

  //Contar quantas propagandas existem em cada estado
  @Query("SELECT l.state, COUNT(p) FROM location l JOIN l.paineis p GROUP BY l.state")
  List<Object[]> countAdvertisementsByState();

  //Buscar localizações de um país específico que possuem reações negativas
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r WHERE l.country = :country AND r.reactionType = 'NEGATIVE'")
  List<Location> findLocationsByCountryWithNegativeReactions(@Param("country") String country);

  //Listar todas as localizações com propagandas de uma empresa específica
  @Query("SELECT DISTINCT l FROM location l JOIN l.paineis p JOIN p.advertising a WHERE a.company = :company")
  List<Location> findLocationsWithAdvertisementsByCompany(@Param("company") String company);

  //Contar reações por tipo de reação em uma cidade específica
  @Query("SELECT r.reactionType, COUNT(r) FROM location l JOIN l.reactions r WHERE l.city = :city GROUP BY r.reactionType")
  List<Object[]> countReactionsByTypeInCity(@Param("city") String city);

  //Obter detalhes das localizações com propagandas e reações relacionadas
  @Query("SELECT l, p, r FROM location l LEFT JOIN l.paineis p LEFT JOIN l.reactions r WHERE r IS NOT NULL OR p IS NOT NULL")
  List<Object[]> findLocationsWithAdvertisementsAndReactions();

  //Buscar todas as localizações que possuem reações para um produto específico
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r JOIN r.advertising a WHERE a.product = :product")
  List<Location> findLocationsWithReactionsByProduct(@Param("product") String product);

  //Listar todas as localizações por estado com o número de reações associadas
  @Query("SELECT l.state, COUNT(r) FROM location l JOIN l.reactions r GROUP BY l.state ORDER BY COUNT(r) DESC")
  List<Object[]> countReactionsByState();

  //Obter localizações que possuem mais de X reações em propagandas específicas
  @Query("SELECT l FROM location l JOIN l.reactions r WHERE r.advertising.name = :advertisingName GROUP BY l HAVING COUNT(r) > :reactionCount")
  List<Location> findLocationsWithMoreThanXReactionsForAdvertising(@Param("advertisingName") String advertisingName, @Param("reactionCount") Long reactionCount);

  //Buscar todas as localizações com propagandas e reações em um estado específico
  @Query("SELECT DISTINCT l FROM location l JOIN l.paineis p JOIN l.reactions r WHERE l.state = :state")
  List<Location> findLocationsWithAdvertisementsAndReactionsByState(@Param("state") String state);

  //Contar as reações positivas por localização e ordená-las por cidade
  @Query("SELECT l.city, COUNT(r) FROM location l JOIN l.reactions r WHERE r.reactionType = 'POSITIVE' GROUP BY l.city ORDER BY l.city")
  List<Object[]> countPositiveReactionsByCity();

  //Buscar todas as localizações que não possuem reações
  @Query("SELECT l FROM location l WHERE l.reactions IS EMPTY")
  List<Location> findLocationsWithoutReactions();
}
