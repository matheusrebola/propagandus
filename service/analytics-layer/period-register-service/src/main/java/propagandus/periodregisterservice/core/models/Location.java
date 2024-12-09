package propagandus.periodregisterservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity(name = "location")
@Table(name = "location_table")
public record Location(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "location_id") Long id,
  @Column(length = 10, nullable = false, name = "zip_code") @NotNull String zipCode,
  @Column(length = 45, nullable = false, name = "public_place") @NotNull String publicPlace,
  @Column(length = 5, nullable = false) @NotNull String number,
  @Column(length = 45, nullable = false) @NotNull String city,
  @Column(length = 4, nullable = false) @NotNull String state,
  @Column(length = 20, nullable = false) @NotNull String country,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Painel> painels
  ) {
}