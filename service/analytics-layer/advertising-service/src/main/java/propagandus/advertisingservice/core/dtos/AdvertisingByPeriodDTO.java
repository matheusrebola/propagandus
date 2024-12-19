package propagandus.advertisingservice.core.dtos;

import propagandus.advertisingservice.core.models.enumerators.EPeriodOfTheDay;

public record AdvertisingByPeriodDTO(
  EPeriodOfTheDay periodOfTheDay, 
  Long totalAdvertisings
) {

}
