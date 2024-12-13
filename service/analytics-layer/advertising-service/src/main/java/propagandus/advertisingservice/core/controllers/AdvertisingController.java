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