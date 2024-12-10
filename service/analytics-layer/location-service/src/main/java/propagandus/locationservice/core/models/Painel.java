package propagandus.locationservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import propagandus.locationservice.core.models.enumerators.EStatus;

@Entity(name = "painel")
@Table(name = "painel_table")
public record Painel(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "painel_id") Long id,
  @Column(length = 10) @NotNull String identification,
  @Enumerated(EnumType.STRING) @Column(length = 4) @NotNull EStatus status,
  @Column(length = 20) @NotNull String model,
  @ManyToOne @JoinColumn(name="location_id", nullable=false) Location location,
  @OneToMany(mappedBy = "painel", cascade = CascadeType.ALL, orphanRemoval = true) List<Advertising> advertising,
  @OneToMany(mappedBy = "painel", cascade = CascadeType.ALL, orphanRemoval = true) List<Attention> attention,
  @OneToMany(mappedBy = "painel", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reaction,
  @OneToOne @JoinColumn(name = "package_type_id", referencedColumnName = "package_type_id", nullable = false) PackageType packageType
  ) {
}