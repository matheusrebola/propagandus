package propagandus.periodregisterservice.core.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "advertising")
@Table(name = "advertising_table")
public record Advertising(
  @Id @Column(name = "advertising_id") UUID id,
  @Column(length = 20, nullable = false, name = "advertising_name") String name,
  @Column(length = 4, nullable = false, name = "advertising_version") String version,
  @Column(length = 50, nullable = false) String company,
  @Column(length = 20, nullable = false) String product,
  @OneToMany(mappedBy = "advertising", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "advertising", cascade = CascadeType.ALL, orphanRemoval = true) List<PeriodRegister> advertisingTime,
  @ManyToOne @JoinColumn(name = "painel_id", nullable = false) Painel painel
) {
}