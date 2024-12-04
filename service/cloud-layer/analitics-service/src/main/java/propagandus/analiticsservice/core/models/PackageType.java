package propagandus.analiticsservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import propagandus.analiticsservice.core.models.enumerators.EPackageType;

@Entity
public record PackageType(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  @Enumerated(EnumType.STRING) EPackageType packageType
  ) {
}
