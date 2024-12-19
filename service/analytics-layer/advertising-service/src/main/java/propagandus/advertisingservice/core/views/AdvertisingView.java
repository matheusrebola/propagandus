package propagandus.advertisingservice.core.views;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import propagandus.advertisingservice.core.dtos.AdvertisingByPeriodDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingCityReactionCountDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingDetailsDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingReactionCountDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingReactionTypeCountDTO;
import propagandus.advertisingservice.core.dtos.AdvertisingWithReactionPeriodDTO;
import propagandus.advertisingservice.core.dtos.ProductReactionCountDTO;
import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.models.enumerators.EMonth;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;

public interface AdvertisingView {
  //Listar todas as propagandas com pelo menos uma reação específica
  //@Query("SELECT DISTINCT a FROM Advertising a JOIN a.reactions r WHERE r.reactionType = :reactionType")
  //public List<AdvertisingDTO> findByReactionType(@Param("reactionType") EReactionType reactionType);

  //Obter todas as propagandas de uma empresa específica com reações positivas
  //@Query("SELECT new com.seu.pacote.AdvertisingDTO(a.id, a.name, a.company, a.product) " +
  //     "FROM Advertising a JOIN a.reactions r WHERE a.company = :company AND r.reactionType = :reactionType")
  // List<AdvertisingDTO> findPositiveReactionsByCompany(@Param("company") String company, @Param("reactionType") EReactionType reactionType);


  //Buscar todas as propagandas que têm reações em uma cidade específica
  //@Query("SELECT DISTINCT a FROM Advertising a JOIN a.reactions r WHERE r.location.city = :city")
  //public List<AdvertisingDTO> findByCityWithReactions(@Param("city") String city);

  //Obter detalhes de uma propaganda específica incluindo as reações
  //@Query("SELECT a, r FROM Advertising a LEFT JOIN a.reactions r WHERE a.name = :name")
  //public List<AdvertisingDetailsDTO> findAdvertisingDetailsWithReactions(@Param("name") String name);

  //Obter todas as propagandas com reações em um estado específico
  //@Query("SELECT DISTINCT a FROM Advertising a JOIN a.reactions r WHERE r.location.state = :state")
  //public List<AdvertisingDTO> findByStateWithReactions(@Param("state") String state);

  //Contar o número total de reações por propaganda
  //@Query("SELECT a, COUNT(r) AS totalReactions FROM Advertising a JOIN a.reactions r GROUP BY a ORDER BY totalReactions DESC")
  //public List<AdvertisingReactionCountDTO> countReactionsByAdvertising();

  //Buscar propagandas com maior número de reações em uma cidade específica
  //@Query("SELECT a, COUNT(r) AS totalReactions FROM Advertising a JOIN a.reactions r JOIN r.location l WHERE l.city = :city GROUP BY a ORDER BY totalReactions DESC")
  //public List<AdvertisingCityReactionCountDTO> findAdvertisingWithMostReactionsInCity(@Param("city") String city);

  //Obter as propagandas com mais reações de um tipo específico
  //@Query("SELECT a, COUNT(r) AS reactionCount FROM Advertising a JOIN a.reactions r WHERE r.reactionType = :reactionType GROUP BY a ORDER BY reactionCount DESC")
  //public List<AdvertisingReactionTypeCountDTO> findAdvertisingWithMostReactionsByType(@Param("reactionType") EReactionType reactionType);

  //Contar o número total de reações por produto
  //@Query("SELECT a.product, COUNT(r) AS totalReactions FROM Advertising a JOIN a.reactions r GROUP BY a.product ORDER BY totalReactions DESC")
  //public List<ProductReactionCountDTO> countReactionsByProduct();

  //Buscar propagandas que receberam reações em um período específico
  //@Query("SELECT a FROM Advertising a JOIN a.reactions r JOIN r.reactionTime p WHERE p.month = :month AND p.year = :year")
  //public List<Advertising> findAdvertisingWithReactionsInPeriod(@Param("month") EMonth month, @Param("year") String year);

  //Listar as propagandas com reações associadas a um painel específico
  //@Query("SELECT DISTINCT a FROM Advertising a JOIN a.reactions r JOIN r.painel p WHERE p.id = :painelId")
  //public List<AdvertisingDTO> findAdvertisingByPainel(@Param("painelId") Long painelId);

  //Obter o total de reações por cidade para cada propaganda
  //@Query("SELECT a, r.location.city, COUNT(r) AS totalReactions FROM Advertising a JOIN a.reactions r GROUP BY a, r.location.city ORDER BY totalReactions DESC")
  //public List<ProductReactionCountDTO> countReactionsByAdvertisingAndCity();

  //Buscar propagandas de um produto específico que tenham mais de X reações
  //@Query("SELECT a FROM Advertising a JOIN a.reactions r WHERE a.product = :product GROUP BY a HAVING COUNT(r) > :threshold")
  //public List<AdvertisingDTO> findAdvertisingByProductWithReactionsAboveThreshold(@Param("product") String product, @Param("threshold") Long threshold);

  //Listar propagandas que geraram reações em locais com mais de N painéis
  //@Query("SELECT DISTINCT a FROM Advertising a JOIN a.reactions r WHERE SIZE(r.location.painels) > :painelCount")
  //public List<AdvertisingDTO> findAdvertisingInLocationsWithMorePainels(@Param("painelCount") Byte painelCount);

  //Contar propagandas por período do dia
  //@Query("SELECT p.periodOfTheDay, COUNT(DISTINCT r.advertising.id) AS totalAdvertisings " +
  //     "FROM PeriodRegister p JOIN p.reaction r GROUP BY p.periodOfTheDay")
  //public List<AdvertisingByPeriodDTO> totalAdvertisingByPeriodOfTheDay();

  //Obter propagandas com reações em períodos registrados
  //@Query("SELECT a.id AS id, a.name AS name, a.company AS company, a.product AS product, " +
  //     "COUNT(DISTINCT r.id) AS totalReactions, COUNT(DISTINCT p.id) AS totalPeriods " +
  //     "FROM Advertising a LEFT JOIN a.reactions r LEFT JOIN r.reactionTime p " +
  //     "GROUP BY a.id, a.name, a.company, a.product")
  //public List<AdvertisingWithReactionPeriodDTO> advertisingsWithReactionInPeriod();

}
