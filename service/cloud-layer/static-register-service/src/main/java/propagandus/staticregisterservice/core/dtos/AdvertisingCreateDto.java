package propagandus.staticregisterservice.core.dtos;

import java.time.LocalDateTime;

public record AdvertisingCreateDto(
  String name,
  String version,
  String company,
  String product,
  LocalDateTime creationTime
  ) {

}
