package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record RegistersBySpecificDays(
  @Id Long id,
  Byte day,
  Long registerCount
) {

}
