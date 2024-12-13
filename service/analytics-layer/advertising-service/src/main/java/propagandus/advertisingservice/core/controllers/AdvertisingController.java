package propagandus.advertisingservice.core.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.dtos.AdvertisingDto;
import propagandus.advertisingservice.core.mappers.AdvertisingMapper;
import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.models.enumerators.EReactionType;
import propagandus.advertisingservice.core.services.AdvertisingService;

@RestController
@RequestMapping("/advertising")
@RequiredArgsConstructor
public class AdvertisingController {
  private final AdvertisingService advertisingService;
  private final AdvertisingMapper advertisingMapper;

  @GetMapping
  public ResponseEntity<List<AdvertisingDto>> getAll(){
    List<AdvertisingDto> result = advertisingService
    .findAll()
    .stream()
    .map(advertisingMapper::map)
    .collect(Collectors.toList());
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping("{id}")
  public ResponseEntity<AdvertisingDto> findById(@PathVariable Long id){
    if(!advertisingService.exists(id)){
      return ResponseEntity.notFound().build();
    }
    AdvertisingDto dto = advertisingMapper.map(advertisingService.findById(id));
    return new ResponseEntity<>(dto, HttpStatus.OK);
  }

  @GetMapping("{name}")
  public List<String> findByName(String name){return null;}

  @GetMapping("{company}")
  public List<String> findByCompany(String company){return null;}

  @GetMapping("{product}")
  public List<String> findByProduct(String product){return null;}

  @GetMapping("{reaction-type}")
  public List<Advertising> findByReactionType(EReactionType reactionType){return null;}

  @GetMapping("{positive-reaction-by-company}")
  public List<Advertising> findPositiveReactionsByCompany(String company){return null;}

  @GetMapping("{city-with-reactions}")
  public List<Advertising> findByCityWithReactions(String city){return null;}

  @GetMapping("{details-with-reactions}")
  public List<Object[]> findAdvertisingDetailsWithReactions(String name){return null;}

  @GetMapping("{state-with-reactions}")
  public List<Advertising> findByStateWithReactions(String state){return null;}

  @GetMapping("/advertising-with-most-reactions-in-city")
  public List<Object[]> findAdvertisingWithMostReactionsInCity(String city){return null;}

  @GetMapping("{advertising_with_most_reaction}")
  public List<Object[]> findAdvertisingWithMostReactionsByType(EReactionType reactionType){return null;}

  @GetMapping("{painel}")
  public List<Advertising> findAdvertisingByPainel(Long painelId){return null;}

  @GetMapping("{product_most_reaction}")
  public List<Advertising> findAdvertisingByProductWithReactionsAboveThreshold(String product, Long threshold){return null;}
  
  @GetMapping("{locations_painels}")
  public List<Advertising> findAdvertisingInLocationsWithMorePainels(Byte painelCount){return null;}
}