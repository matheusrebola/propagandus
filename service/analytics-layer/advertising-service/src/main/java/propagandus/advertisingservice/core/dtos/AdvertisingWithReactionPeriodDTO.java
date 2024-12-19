package propagandus.advertisingservice.core.dtos;

public record AdvertisingWithReactionPeriodDTO(
  Long id, 
  String name, 
  String company, 
  String product, 
  Long totalReactions, 
  Long totalPeriods
) {

}
