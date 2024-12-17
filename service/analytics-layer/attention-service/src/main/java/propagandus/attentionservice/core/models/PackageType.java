package propagandus.attentionservice.core.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import propagandus.attentionservice.core.models.enumerators.EPackageType;

@Entity(name = "package_type")
@Table(name = "package_type_table")
public record PackageType(
  @Id @Column(name = "package_type_id") UUID id,
  @Enumerated(EnumType.STRING) @Column(length = 10) @NotNull EPackageType packageType,
  @OneToOne(mappedBy = "packageType") Painel painel
  ) {
}
