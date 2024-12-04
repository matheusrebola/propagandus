package propagandus.analiticsservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import propagandus.analiticsservice.core.models.enumerators.EPackageType;

@Entity
public record PackageType(
  @Id Long id,
  @Enumerated EPackageType packageType
  ) {
}
