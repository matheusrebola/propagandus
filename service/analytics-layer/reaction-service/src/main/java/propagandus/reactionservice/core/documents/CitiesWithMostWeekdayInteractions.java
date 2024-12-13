package propagandus.reactionservice.core.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public record CitiesWithMostWeekdayInteractions(
  @Id Long id,
  String city,
  Long interactionCount
) {

}
