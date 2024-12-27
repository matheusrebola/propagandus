package propagandus.staticregisterservice.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "painel")
@Table(name = "painel_table")
public record Painel(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "painel_id") Long id,
  @Column(length = 50, nullable = false) String identification,
  @Column(length = 20, nullable = false) String model,
  @ManyToOne @JoinColumn(name="location_id", nullable=false) Location location,
  @OneToOne @JoinColumn(name = "package_type_id", referencedColumnName = "package_type_id", nullable = false) PackageType packageType
  ) {
}
