package propagandus.advertisingservice.core.dtos;

public record ProductPreferencesDTO(
  Long productId,
  String advertisingCompany,
  Integer totalReactions,
  Byte avgReactionScale,
  Short totalAttention
){}