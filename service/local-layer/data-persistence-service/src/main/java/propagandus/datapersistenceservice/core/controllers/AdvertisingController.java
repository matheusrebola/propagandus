package propagandus.datapersistenceservice.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.dtos.AdvertisingCreateDto;
import propagandus.datapersistenceservice.core.dtos.AdvertisingDto;
import propagandus.datapersistenceservice.core.mappers.AdvertisingMapper;
import propagandus.datapersistenceservice.core.models.Advertising;
import propagandus.datapersistenceservice.core.services.AdvertisingService;

@RestController
@RequestMapping("/advertising")
@RequiredArgsConstructor
public class AdvertisingController {
  private final AdvertisingService advertisingService;
  private final AdvertisingMapper advertisingMapper;

  @PostMapping
  public ResponseEntity<AdvertisingDto> create(@Valid @RequestBody AdvertisingCreateDto requestDto){
    Advertising advertising = advertisingMapper.map(requestDto);
    Advertising advertisignSaved = advertisingService.save(advertising);
    AdvertisingDto responseDto = advertisingMapper.map(advertisignSaved);
    return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
  }
}
