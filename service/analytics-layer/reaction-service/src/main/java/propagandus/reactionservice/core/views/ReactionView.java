package propagandus.analiticsservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.analiticsservice.core.models.Reaction;
import propagandus.analiticsservice.core.models.enumerators.EDayWeek;
import propagandus.analiticsservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.analiticsservice.core.models.enumerators.EReactionType;

public interface ReactionView {
  //Encontrar reações por cidade e tipo de reação
  @Query("SELECT r FROM reaction r WHERE r.location.city = :city AND r.reactionType = :reactionType")
  List<Reaction> findByCityAndReactionType(@Param("city") String city, @Param("reactionType") EReactionType reactionType);

  //Contar quantas reações existem por propaganda
  @Query("SELECT a.name, COUNT(r) FROM advertising a JOIN a.reactions r GROUP BY a.name")
  List<Object[]> countReactionsByAdvertising();

  //Buscar todas as reações em uma localização específica
  @Query("SELECT r FROM reaction r WHERE r.location.zipCode = :zipCode")
  List<Reaction> findByZipCode(@Param("zipCode") String zipCode);

  //Listar todas as reações de um produto específico
  @Query("SELECT r FROM reaction r WHERE r.advertising.product = :product")
  List<Reaction> findReactionsByProduct(@Param("product") String product);

  //Contar reações por tipo de reação e cidade
  @Query("SELECT r.reactionType, l.city, COUNT(r) FROM reaction r JOIN r.location l GROUP BY r.reactionType, l.city")
  List<Object[]> countReactionsByTypeAndCity();

  //Buscar todas as reações de uma versão de propaganda específica
  @Query("SELECT r FROM reaction r WHERE r.advertising.version = :version")
  List<Reaction> findReactionsByAdvertisingVersion(@Param("version") String version);

  //Contar reações associadas a cada painel por período do dia
  @Query("SELECT r.location.city, p.periodOfTheDay, COUNT(r) FROM reaction r JOIN period_register p ON r.id = p.id GROUP BY r.location.city, p.periodOfTheDay")
  List<Object[]> countReactionsByPainelAndPeriod();

  //Listar as reações geradas em um dia específico da semana
  @Query("SELECT r FROM reaction r JOIN period_register p ON r.id = p.id WHERE p.dayWeek = :dayWeek")
  List<Reaction> findReactionsByDayOfWeek(@Param("dayWeek") EDayWeek dayWeek);

  //Listar as cidades com mais interações em painéis durante a semana
  @Query("SELECT l.city, COUNT(r) FROM reaction r JOIN r.location l JOIN period_register p ON r.id = p.id WHERE p.dayWeek IN ('MON', 'TUE', 'WED', 'THU', 'FRI') GROUP BY l.city ORDER BY COUNT(r) DESC")
  List<Object[]> findCitiesWithMostWeekdayInteractions();

  //Obter todas as reações associadas a painéis em uma localização específica durante um período do dia
  @Query("SELECT r FROM reaction r JOIN r.location l JOIN period_register p ON r.id = p.id WHERE l.city = :city AND p.periodOfTheDay = :period")
  List<Reaction> findReactionsByLocationAndPeriod(@Param("city") String city, @Param("period") EPeriodOfTheDay period);
}
