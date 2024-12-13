package propagandus.periodregisterservice.core.documents;

import jakarta.persistence.Id;

public record PeakRegisterHour(
  @Id Long id,
  Byte hour,
  Long registerCount
) {

}
