package propagandus.painelservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record ModelsWithMostPeopleRegistered(
  @Id Long id,
  String model,
  Long totalPeople
) {

}
