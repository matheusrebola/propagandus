package propagandus.locationservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record LocationsWithAdvertisementsByCompany(
  @Id Long id,
  Long locationId,
  String city,
  String state,
  String companyName // Pode ser opcional se a query for genérica
) {

}
