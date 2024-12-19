package propagandus.reactionservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.reactionservice.core.dtos.CityInteractionCountDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByAdvertisingDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByPainelAndPeriodDTO;
import propagandus.reactionservice.core.dtos.ReactionCountByTypeAndCityDTO;
import propagandus.reactionservice.core.dtos.ReactionDTO;
import propagandus.reactionservice.core.models.enumerators.EDayWeek;
import propagandus.reactionservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.reactionservice.core.models.enumerators.EReactionType;

public interface ReactionView {
  /*
  //Encontrar reações por cidade e tipo de reação
  @Query("SELECT r FROM reaction r WHERE r.location.city = :city AND r.reactionType = :reactionType")
  List<ReactionDTO> findByCityAndReactionType(@Param("city") String city, @Param("reactionType") EReactionType reactionType);

  //Contar quantas reações existem por propaganda
  @Query("SELECT a.name, COUNT(r) FROM advertising a JOIN a.reactions r GROUP BY a.name")
  List<ReactionCountByAdvertisingDTO> countReactionsByAdvertising();

  //Buscar todas as reações em uma localização específica
  @Query("SELECT r FROM reaction r WHERE r.location.zipCode = :zipCode")
  List<ReactionDTO> findByZipCode(@Param("zipCode") String zipCode);

  //Listar todas as reações de um produto específico
  @Query("SELECT r FROM reaction r WHERE r.advertising.product = :product")
  List<ReactionDTO> findReactionsByProduct(@Param("product") String product);

  //Contar reações por tipo de reação e cidade
  @Query("SELECT r.reactionType, l.city, COUNT(r) FROM reaction r JOIN r.location l GROUP BY r.reactionType, l.city")
  List<ReactionCountByTypeAndCityDTO> countReactionsByTypeAndCity();

  //Buscar todas as reações de uma versão de propaganda específica
  @Query("SELECT r FROM reaction r WHERE r.advertising.version = :version")
  List<ReactionDTO> findReactionsByAdvertisingVersion(@Param("version") String version);

  //Contar reações associadas a cada painel por período do dia
  @Query("SELECT r.location.city, p.periodOfTheDay, COUNT(r) FROM reaction r JOIN period_register p ON r.id = p.id GROUP BY r.location.city, p.periodOfTheDay")
  List<ReactionCountByPainelAndPeriodDTO> countReactionsByPainelAndPeriod();

  //Listar as reações geradas em um dia específico da semana
  @Query("SELECT r FROM reaction r JOIN period_register p ON r.id = p.id WHERE p.dayWeek = :dayWeek")
  List<ReactionDTO> findReactionsByDayOfWeek(@Param("dayWeek") EDayWeek dayWeek);

  //Listar as cidades com mais interações em painéis durante a semana
  @Query("SELECT l.city, COUNT(r) FROM reaction r JOIN r.location l JOIN period_register p ON r.id = p.id WHERE p.dayWeek IN ('MON', 'TUE', 'WED', 'THU', 'FRI') GROUP BY l.city ORDER BY COUNT(r) DESC")
  List<CityInteractionCountDTO> findCitiesWithMostWeekdayInteractions();

  //Obter todas as reações associadas a painéis em uma localização específica durante um período do dia
  @Query("SELECT r FROM reaction r JOIN r.location l JOIN period_register p ON r.id = p.id WHERE l.city = :city AND p.periodOfTheDay = :period")
  List<ReactionDTO> findReactionsByLocationAndPeriod(@Param("city") String city, @Param("period") EPeriodOfTheDay period);

  /*@Query"""
    SELECT 
        a.advertising_name AS advertising,
        AVG(r.reaction_type) AS avg_reaction_type
    FROM reaction_table r
    LEFT JOIN advertising_table a ON a.advertising_id = r.advertising_id
    GROUP BY a.advertising_name
""") */
  /*@Query("""
    SELECT 
        l.location_type,
        r.reaction_type,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN location_table l ON l.location_id = r.location_id
    GROUP BY l.location_type, r.reaction_type
""") */
  /*@Query("""
    SELECT 
        p.painel_status AS status,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN painel_table p ON p.painel_id = r.painel_id
    GROUP BY p.painel_status
""") */
  /*@Query"""
    SELECT 
        r.reaction_type,
        pr.period_of_the_day,
        COUNT(r.reaction_id) AS total_reactions
    FROM reaction_table r
    LEFT JOIN date_time_table pr ON pr.period_register_id = r.period_time_id
    GROUP BY r.reaction_type, pr.period_of_the_day
""") */
}
