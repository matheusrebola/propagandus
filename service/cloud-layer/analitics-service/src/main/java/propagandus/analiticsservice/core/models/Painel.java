package propagandus.analiticsservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import propagandus.analiticsservice.core.models.enumerators.EStatus;

@Entity
public record Painel(
  @Id Long id,
  @OneToMany Location location,
  String identification,
  @Enumerated EStatus status,
  String model
  ) {
}
