package propagandus.staticregisterservice.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import propagandus.staticregisterservice.core.dtos.AdvertisingCreateDto;
import propagandus.staticregisterservice.core.dtos.AdvertisingDto;
import propagandus.staticregisterservice.core.mappers.AdvertisingMapper;
import propagandus.staticregisterservice.core.models.Advertising;
import propagandus.staticregisterservice.core.services.AdvertisingService;

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
