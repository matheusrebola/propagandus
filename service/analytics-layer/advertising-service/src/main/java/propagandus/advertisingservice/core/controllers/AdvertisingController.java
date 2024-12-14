package propagandus.advertisingservice.core.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.dtos.AdvertisingReactionCountDTO;
import propagandus.advertisingservice.core.dtos.ProductReactionCountDTO;
import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;

@RestController
@RequestMapping("/advertising")
@RequiredArgsConstructor
public class AdvertisingController {

  @GetMapping("/reaction")
  public List<AdvertisingReactionCountDTO> countReactionsByAdvertising(){return null;}

  @GetMapping("/by-product")
  public List<ProductReactionCountDTO> countReactionsByProduct(){return null;}

  @GetMapping("/by-city")
  public List<ProductReactionCountDTO> countReactionsByAdvertisingAndCity(){return null;}
  
  @GetMapping("{name}")
  List<String> findByName(@PathVariable String name){return null;}
  
  @GetMapping("{version}")
  List<String> findByVersion(@PathVariable String version){return null;}

  @GetMapping("{company}")
  List<String> findByCompany(@PathVariable String company){return null;}

  @GetMapping("{product}")
  List<String> findByProduct(@PathVariable String product){return null;}

  @GetMapping("/reaction/{company}")
  public List<Advertising> findPositiveReactionsByCompany(@PathVariable String company){return null;}

  @GetMapping("/reaction/{city}")
  public List<Advertising> findByCityWithReactions(@PathVariable String city){return null;}

  @GetMapping("/reaction/{name}")
  public List<Object[]> findAdvertisingDetailsWithReactions(@PathVariable String name){return null;}

  @GetMapping("/location/{state}")
  public List<Advertising> findByStateWithReactions(@PathVariable String state){return null;}

  @GetMapping("/location/{city}")
  public List<Object[]> findAdvertisingWithMostReactionsInCity(@PathVariable String city){return null;}

  @GetMapping("/reaction/{reaction-type}")
  public List<Object[]> findAdvertisingWithMostReactionsByType(@PathVariable EReactionType reactionType){return null;}

  @GetMapping("/painel/{painel-id}")
  public List<Advertising> findAdvertisingByPainel(@PathVariable Long painelId){return null;}
  
  @GetMapping("/painel/{painel-count}")
  public List<Advertising> findAdvertisingInLocationsWithMorePainels(@PathVariable Byte painelCount){return null;}
}