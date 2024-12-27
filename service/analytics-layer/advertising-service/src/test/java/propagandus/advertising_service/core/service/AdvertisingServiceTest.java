package propagandus.advertising_service.core.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import propagandus.advertisingservice.core.documents.CampaignEffectiveness;
import propagandus.advertisingservice.core.services.AdvertisingService;

@SpringBootTest
public class AdvertisingServiceTest {
  @Autowired
  private AdvertisingService advertisingService;

  @Test
  public void testCampaignEffectiveness() {
    List<CampaignEffectiveness> campaigns = advertisingService.campaignEffectiveness();
    assertNotNull(campaigns);
    assertFalse(campaigns.isEmpty());
  }
}
