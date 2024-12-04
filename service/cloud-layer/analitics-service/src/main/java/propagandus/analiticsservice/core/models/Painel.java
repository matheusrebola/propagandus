package propagandus.analiticsservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import propagandus.analiticsservice.core.models.enumerators.EStatus;

@Entity
public record Painel(
  @Id Long id,
  @ManyToOne @JoinColumn(name="location_id", nullable=false) Location location,
  String identification,
  @Enumerated EStatus status,
  String model
  ) {
}
