package propagandus.viewservice.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.LocationPerformance;
import propagandus.viewservice.core.services.LocationService;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {
  private final LocationService locationService;
  
  @GetMapping
  public ResponseEntity<List<LocationPerformance>> locationPerformance(){
    List<LocationPerformance> result = locationService.locationPerformance();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}