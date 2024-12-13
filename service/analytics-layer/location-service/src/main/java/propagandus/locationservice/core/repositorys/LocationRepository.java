package propagandus.locationservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.dtos.LocationAdvertisementDTO;
import propagandus.locationservice.core.dtos.LocationDTO;
import propagandus.locationservice.core.dtos.LocationDetailsDTO;
import propagandus.locationservice.core.dtos.LocationProductReactionDTO;
import propagandus.locationservice.core.dtos.LocationReactionCountDTO;
import propagandus.locationservice.core.dtos.LocationReactionThresholdDTO;
import propagandus.locationservice.core.dtos.ReactionTypeCountDTO;
import propagandus.locationservice.core.models.Location;
import propagandus.locationservice.core.models.enumerators.ELocationType;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
  List<String> findByZipCode(String zipCode);
  List<String> findByPublicPlace(String publicPlace);
  List<ELocationType> findByLocationType(ELocationType locationType);

  //Listar locais com o maior número de reações
  @Query("SELECT l.city, COUNT(r) FROM location l JOIN l.reactions r GROUP BY l.city ORDER BY COUNT(r) DESC")
  List<LocationReactionCountDTO> findLocationsWithMostReactions();

  //Listar todas as localizações com propagandas associadas
  @Query("SELECT DISTINCT l FROM location l JOIN l.painels p WHERE p IS NOT NULL")
  List<LocationAdvertisementDTO> findLocationsWithAdvertisements();

  //Buscar todas as localizações em uma cidade específica com reações positivas
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r WHERE l.city = :city AND r.reactionType = 'POSITIVE'")
  List<LocationDTO> findLocationsByCityWithPositiveReactions(@Param("city") String city);

  //Listar todas as localizações que possuem reações associadas
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r WHERE r IS NOT NULL")
  List<LocationDTO> findLocationsWithReactions();

  //Contar quantas propagandas existem em cada estado
  @Query("SELECT l.state, COUNT(p) FROM location l JOIN l.painels p GROUP BY l.state")
  List<LocationReactionCountDTO> countAdvertisementsByState();

  //Buscar localizações de um país específico que possuem reações negativas
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r WHERE l.country = :country AND r.reactionType = 'NEGATIVE'")
  List<LocationDTO> findLocationsByCountryWithNegativeReactions(@Param("country") String country);

  //Listar todas as localizações com propagandas de uma empresa específica
  @Query("SELECT DISTINCT l FROM location l JOIN l.painels p JOIN p.advertisings a WHERE a.company = :company")
  List<LocationAdvertisementDTO> findLocationsWithAdvertisementsByCompany(@Param("company") String company);

  //Contar reações por tipo de reação em uma cidade específica
  @Query("SELECT r.reactionType, COUNT(r) FROM location l JOIN l.reactions r WHERE l.city = :city GROUP BY r.reactionType")
  List<ReactionTypeCountDTO> countReactionsByTypeInCity(@Param("city") String city);

  //Obter detalhes das localizações com propagandas e reações relacionadas
  @Query("SELECT l, p, r FROM location l LEFT JOIN l.painels p LEFT JOIN l.reactions r WHERE r IS NOT NULL OR p IS NOT NULL")
  List<LocationDetailsDTO> findLocationsWithAdvertisementsAndReactions();

  //Buscar todas as localizações que possuem reações para um produto específico
  @Query("SELECT DISTINCT l FROM location l JOIN l.reactions r JOIN r.advertising a WHERE a.product = :product")
  List<LocationProductReactionDTO> findLocationsWithReactionsByProduct(@Param("product") String product);

  //Listar todas as localizações por estado com o número de reações associadas
  @Query("SELECT l.state, COUNT(r) FROM location l JOIN l.reactions r GROUP BY l.state ORDER BY COUNT(r) DESC")
  List<LocationReactionCountDTO> countReactionsByState();

  //Obter localizações que possuem mais de X reações em propagandas específicas
  @Query("SELECT l FROM location l JOIN l.reactions r WHERE r.advertising.name = :advertisingName GROUP BY l HAVING COUNT(r) > :reactionCount")
  List<LocationReactionThresholdDTO> findLocationsWithMoreThanXReactionsForAdvertising(@Param("advertisingName") String advertisingName, @Param("reactionCount") Long reactionCount);

  //Buscar todas as localizações com propagandas e reações em um estado específico
  @Query("SELECT DISTINCT l FROM location l JOIN l.painels p JOIN l.reactions r WHERE l.state = :state")
  List<LocationAdvertisementDTO> findLocationsWithAdvertisementsAndReactionsByState(@Param("state") String state);

  //Contar as reações positivas por localização e ordená-las por cidade
  @Query("SELECT l.city, COUNT(r) FROM location l JOIN l.reactions r WHERE r.reactionType = 'POSITIVE' GROUP BY l.city ORDER BY l.city")
  List<LocationReactionCountDTO> countPositiveReactionsByCity();

  //Buscar todas as localizações que não possuem reações
  @Query("SELECT l FROM location l WHERE l.reactions IS EMPTY")
  List<LocationDTO> findLocationsWithoutReactions();

  /*@Query("""
    SELECT 
        a.advertising_name AS advertising,
        l.city,
        l.district,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN advertising_table a ON a.advertising_id = r.advertising_id
    LEFT JOIN location_table l ON l.location_id = r.location_id
    GROUP BY a.advertising_name, l.city, l.district;
""") */
  /*@Query("""
    SELECT 
        l.location_id AS id,
        l.city,
        l.district,
        r.reaction_type,
        COUNT(r.reaction_id) AS total_reactions
    FROM location_table l
    LEFT JOIN reaction_table r ON r.location_id = l.location_id
    GROUP BY l.location_id, l.city, l.district, r.reaction_type;
""") */
}
