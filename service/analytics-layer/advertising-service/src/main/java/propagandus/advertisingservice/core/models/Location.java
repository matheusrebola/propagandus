package propagandus.advertisingservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import propagandus.advertisingservice.core.models.enumerators.ECityZone;
import propagandus.advertisingservice.core.models.enumerators.ECityZoneType;
import propagandus.advertisingservice.core.models.enumerators.ELocationType;

@Entity(name = "location")
@Table(name = "location_table")
public record Location(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "location_id") Long id,
  @Column(length = 45, nullable = false, name = "street_name") String publicPlace,
  @Column(length = 5, nullable = false, name = "street_number") String number,
  @Column(length = 20, nullable = false, name = "location_type") @Enumerated(EnumType.STRING) ELocationType locationType,
  @Column(length = 255, nullable = false, name = "location_description") String description,
  @Column(length = 45, nullable = false) String city,
  @Enumerated(EnumType.STRING) @Column(length = 10, nullable = false, name = "city_zone") ECityZone cityZone,
  @Enumerated(EnumType.STRING) @Column(length = 10, nullable = false, name = "city_zone_type") ECityZoneType cityZoneType,
  @Column(length = 4, nullable = false, name = "district") String state,
  @Column(length = 50, nullable = false) String country,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Attention> attentions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Painel> painels
) {
}
