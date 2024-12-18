package propagandus.datalake.core.dtos;

import java.time.LocalDateTime;

public record AdvertisingDto(
  Long advertisingId,
  String name,
  String version,
  String company,
  String product,
  LocalDateTime creationTime  
) {

}
