package propagandus.advertisingservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.models.enumerators.EMonth;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising,Long>{
  List<String> findByName(String name);
  List<String> findByVersion(String version);
  List<String> findByCompany(String company);
  List<String> findByProduct(String product);
  //Listar todas as propagandas com pelo menos uma reação específica
  @Query("SELECT DISTINCT a FROM advertising a JOIN a.reactions r WHERE r.reactionType = :reactionType")
  List<Advertising> findByReactionType(@Param("reactionType") EReactionType reactionType);

  //Obter todas as propagandas de uma empresa específica com reações positivas
  @Query("SELECT a FROM advertising a JOIN a.reactions r WHERE a.company = :company AND r.reactionType = 'POSITIVE'")
  List<Advertising> findPositiveReactionsByCompany(@Param("company") String company);

  //Buscar todas as propagandas que têm reações em uma cidade específica
  @Query("SELECT DISTINCT a FROM advertising a JOIN a.reactions r WHERE r.location.city = :city")
  List<Advertising> findByCityWithReactions(@Param("city") String city);

  //Obter detalhes de uma propaganda específica incluindo as reações
  @Query("SELECT a, r FROM advertising a LEFT JOIN a.reactions r WHERE a.name = :name")
  List<Object[]> findAdvertisingDetailsWithReactions(@Param("name") String name);

  //Obter todas as propagandas com reações em um estado específico
  @Query("SELECT DISTINCT a FROM advertising a JOIN a.reactions r WHERE r.location.state = :state")
  List<Advertising> findByStateWithReactions(@Param("state") String state);

  //Contar o número total de reações por propaganda
  @Query("SELECT a, COUNT(r) AS totalReactions FROM advertising a JOIN a.reactions r GROUP BY a ORDER BY totalReactions DESC")
  List<Object[]> countReactionsByAdvertising();

  //Buscar propagandas com maior número de reações em uma cidade específica
  @Query("SELECT a, COUNT(r) AS totalReactions FROM advertising a JOIN a.reactions r JOIN r.location l WHERE l.city = :city GROUP BY a ORDER BY totalReactions DESC")
  List<Object[]> findAdvertisingWithMostReactionsInCity(@Param("city") String city);

  //Obter as propagandas com mais reações positivas (ou qualquer outro tipo de reação)
  @Query("SELECT a, COUNT(r) AS positiveReactions FROM advertising a JOIN a.reactions r WHERE r.reactionType = :reactionType GROUP BY a ORDER BY positiveReactions DESC")
  List<Object[]> findAdvertisingWithMostReactionsByType(@Param("reactionType") EReactionType reactionType);

  //Contar o número total de reações por produto
  @Query("SELECT a.product, COUNT(r) AS totalReactions FROM advertising a JOIN a.reactions r GROUP BY a.product ORDER BY totalReactions DESC")
  List<Object[]> countReactionsByProduct();

  //Buscar propagandas que receberam reações em um período específico
  @Query("SELECT a FROM advertising a JOIN a.reactions r JOIN period_register p ON r.id = p.id WHERE p.month = :month AND p.year = :year")
  List<Advertising> findAdvertisingWithReactionsInPeriod(@Param("month") EMonth month, @Param("year") String year);

  //Listar as propagandas com reações associadas a um painel específico
  @Query("SELECT DISTINCT a FROM advertising a JOIN a.reactions r JOIN r.location l JOIN l.painels p WHERE p.id = :painelId")
  List<Advertising> findAdvertisingByPainel(@Param("painelId") Long painelId);

  //Obter o total de reações por cidade para cada propaganda
  @Query("SELECT a, l.city, COUNT(r) AS totalReactions FROM advertising a JOIN a.reactions r JOIN r.location l GROUP BY a, l.city ORDER BY totalReactions DESC")
  List<Object[]> countReactionsByAdvertisingAndCity();

  //Buscar propagandas de um produto específico que tenham mais de X reações
  @Query("SELECT a FROM advertising a JOIN a.reactions r WHERE a.product = :product GROUP BY a HAVING COUNT(r) > :threshold")
  List<Advertising> findAdvertisingByProductWithReactionsAboveThreshold(@Param("product") String product, @Param("threshold") Long threshold);

  //Listar propagandas que geraram reações em locais com mais de N painéis
  @Query("SELECT a FROM advertising a JOIN a.reactions r JOIN r.location l WHERE SIZE(l.painels) > :painelCount")
  List<Advertising> findAdvertisingInLocationsWithMorePainels(@Param("painelCount") Byte painelCount);

  //@Query("SELECT pr.period_of_the_day, COUNT(DISTINCT pr.advertising_id) AS total_advertisings FROM date_time_table pr GROUP BY pr.period_of_the_day")
  //List<Object[]> totalAdvertisingyPeriodOfTheDay();

  //@Query("SELECT a.advertising_id AS id, a.advertising_name AS name, a.company, a.product, COUNT(DISTINCT r.reaction_id) AS total_reactions, COUNT(DISTINCT pr.period_register_id) AS total_periods FROM advertising_table a LEFT JOIN reaction_table r ON r.advertising_id = a.advertising_id LEFT JOIN date_time_table pr ON pr.advertising_id = a.advertising_id GROUP BY a.advertising_id, a.advertising_name, a.company, a.product")
  //List<Object[]> advertisingsWithReactionInPeriod();
}
