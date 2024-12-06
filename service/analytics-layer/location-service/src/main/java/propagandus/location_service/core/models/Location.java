package propagandus.location_service.core.models;

public record Location(
  Long id,
  String zipCode,
  String publicPlace,
  String number,
  String city,
  String state,
  String country,
  Long reactionsId,
  Long paineisId
  ) {
}
