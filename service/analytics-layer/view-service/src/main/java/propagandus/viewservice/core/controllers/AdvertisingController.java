package propagandus.viewservice.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.CampaignEffectiveness;
import propagandus.viewservice.core.documents.ProductPreferences;
import propagandus.viewservice.core.services.AdvertisingService;

@RestController
@RequestMapping("/advertising")
@RequiredArgsConstructor
public class AdvertisingController {
  private final AdvertisingService advertisingService;

  @GetMapping("/campaign-effectiveness")
  public ResponseEntity<List<CampaignEffectiveness>> campaignEffectiveness(){
    List<CampaignEffectiveness> result = advertisingService.campaignEffectiveness();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping("/product-preferences")
  public ResponseEntity<List<ProductPreferences>> productPreferences(){
    List<ProductPreferences> result = advertisingService.productPreferences();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}