package propagandus.painel_service.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import propagandus.painel_service.core.models.enumerators.EStatus;

public record Painel(
  Long id,
  Long locationId,
  String identification,
  EStatus status,
  String model
  ) {
}
