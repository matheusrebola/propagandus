package propagandus.locationservice.core.dtos;

public record LocationAdvertisementDTO(
  Long locationId,
  String city,
  String state,
  String companyName // Pode ser opcional se a query for genérica
) {

}
