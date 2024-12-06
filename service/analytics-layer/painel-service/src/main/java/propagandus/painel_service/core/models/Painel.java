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

@Entity(name = "painel")
@Table(name = "painel_table")
public record Painel(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "painel_id") Long id,
  @ManyToOne @JoinColumn(name="location_id", nullable=false) Location location,
  @Column(length = 10) String identification,
  @Enumerated(EnumType.STRING) @Column(length = 4) EStatus status,
  @Column(length = 20) String model
  ) {
}