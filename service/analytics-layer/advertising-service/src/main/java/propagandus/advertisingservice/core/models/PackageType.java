package propagandus.advertisingservice.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import propagandus.advertisingservice.core.models.enumerators.EPackageType;

@Entity(name = "package_type")
@Table(name = "package_type_table")
public record PackageType(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "package_type_id") Byte id,
  @Enumerated(EnumType.STRING) @Column(length = 10, nullable = false) EPackageType packageType,
  @OneToOne(mappedBy = "packageType") Painel painel
  ) {
}
