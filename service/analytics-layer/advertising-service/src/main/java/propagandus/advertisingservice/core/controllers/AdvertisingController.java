package propagandus.advertisingservice.core.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import propagandus.advertisingservice.core.dtos.AdvertisingCreateDto;
import propagandus.advertisingservice.core.dtos.AdvertisingDto;
import propagandus.advertisingservice.core.mappers.AdvertisingMapper;
import propagandus.advertisingservice.core.models.Advertising;
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

  @PostMapping
  public ResponseEntity<AdvertisingDto> create(@Valid @RequestBody AdvertisingCreateDto requestDto){
    Advertising advertising = advertisingMapper.map(requestDto);
    Advertising advertisignSaved = advertisingService.save(advertising);
    AdvertisingDto responseDto = advertisingMapper.map(advertisignSaved);
    return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
  }
}
