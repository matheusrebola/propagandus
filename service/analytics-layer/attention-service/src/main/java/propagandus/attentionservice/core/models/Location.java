package propagandus.attentionservice.core.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import propagandus.attentionservice.core.models.enumerators.ELocationType;

@Entity(name = "location")
@Table(name = "location_table")
public record Location(
  @Id @Column(name = "location_id") UUID id,
  @Column(length = 10, nullable = false, name = "city_zone") String cityZone,
  @Column(length = 10, nullable = false, name = "zip_code") String zipCode,
  @Column(length = 45, nullable = false, name = "public_place") String publicPlace,
  @Column(length = 5, nullable = false, name = "street_number") String number,
  @Column(length = 20, nullable = false, name = "location_type") @Enumerated(EnumType.STRING) ELocationType locationType,
  @Column(length = 45, nullable = false) String city,
  @Column(length = 4, nullable = false, name = "district") String state,
  @Column(length = 50, nullable = false) String country,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Painel> painels
  ) {
}